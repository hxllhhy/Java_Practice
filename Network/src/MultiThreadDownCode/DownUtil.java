package MultiThreadDownCode;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownUtil {
    private String path;            //定义下载资源的路径
    private String targetFile;      //指定所下下载的文件的保存位置
    private int threadNum;          //定义需要使用多少个线程下载资源
    private DownThread[] threads;   //定义下载的线程对象
    private int fileSize;           //定义下载的文件的总大小

    public DownUtil(String path, String targetFile, int threadNum) {
        this.path = path;
        this.threadNum = threadNum;
        this.targetFile = targetFile;
        threads = new DownThread[threadNum];
    }

    public void download() throws Exception {
        URL url = new URL(path); //根据path创建URL对象来调用其他方法访问其对应的资源
        HttpURLConnection conn = (HttpURLConnection) url.openConnection(); //返回一个URLConnection对象，代表了与URL所引用对象的连接
        conn.setConnectTimeout(5 * 1000); //设置连接主机超时（单位：毫秒）
        conn.setRequestMethod("GET"); //设定请求的方法
        conn.setRequestProperty("Accept", "*/*");  //设置HttpURLConnection的接收的文件类型
        conn.setRequestProperty("Accept-Language", "zh-CN");  //设置HttpURLConnection的接收语言
        conn.setRequestProperty("Charset", "UTF-8");   //设置HttpURLConnection的字符编码
        conn.setRequestProperty("Connection", "Keep-Alive"); //设置客户端支持的连接方式，保持一段连接，默认为3000ms


        //得到文件大小
        fileSize = conn.getContentLength();
        conn.disconnect();
        int currentPartSize = fileSize/threadNum + 1;

        RandomAccessFile file = new RandomAccessFile(targetFile, "rw");
        //设置本地文件的大小
        file.setLength(fileSize);
        file.close();
        for(int i = 0; i < threadNum; i++) {
            int startPos = i * currentPartSize; //计算每个线程下载的开始位置
            RandomAccessFile currentPart = new RandomAccessFile(targetFile, "rw"); //每个线程都使用一个RandomAccessFile进行下载
            currentPart.seek(startPos);  //按字节定位
            threads[i] = new DownThread(startPos, currentPartSize, currentPart); //创建下载线程
            threads[i].start(); //启动下载线程
        }
    }

    //获取下载的完成百分比
    public double getCompleteRate() {
        int sumSize = 0;
        for (int i = 0; i < threadNum; i++) {
            sumSize += threads[i].length;
        }
        return sumSize*1.0/fileSize;
    }


    public class DownThread extends Thread {
        private int startPos;  //当前线程的下载位置
        private int currentPartSize;  //定义当前线程负责下载的文件大小
        private RandomAccessFile currentPart;  //当前线程需要下载的文件块
        public int length;  //定义该线程已下载字节数

        public DownThread(int startPos, int currentPartSize, RandomAccessFile currentPart) {
            this.startPos = startPos;
            this.currentPartSize = currentPartSize;
            this.currentPart = currentPart;
        }

        @Override
        public void run() {
            try {
                URL url = new URL(path);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setConnectTimeout(5 * 1000);
                conn.setRequestMethod("GET");
                conn.setRequestProperty("Accept", "*/*");
                conn.setRequestProperty("Accept-Language", "zh-CN");
                conn.setRequestProperty("Charset", "UTF-8");
                InputStream inStream = conn.getInputStream();

                //跳过startPos个字节，表明该线程下载自己负责的那部分文件
                inStream.skip(this.startPos);
                byte[] buffer = new byte[1024];
                int hasRead = 0;

                //读取网络数据，并写入本地文件
                while (length < currentPartSize && (hasRead = inStream.read(buffer)) != -1) {
                    currentPart.write(buffer, 0, hasRead);
                    length += hasRead; //累计该线程下载的总大小
                }
                currentPart.close();
                inStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
