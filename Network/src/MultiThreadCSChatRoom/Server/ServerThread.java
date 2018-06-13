package MultiThreadCSChatRoom.Server;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {

    //定义当前线程所处理的Socket
    Socket s = null;

    //该线程所处理的Socket对应的输入流
    BufferedReader br = null;

    public ServerThread(Socket s) throws IOException {
        this.s = s;
        br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //初始化该Socket对应的输入流
    }


    @Override
    public void run() {
        try {
            String content = null;

            //采用循环不断从Socket中读取客户端发送来的数据
            while((content = readFromClient()) != null) {
                //遍历socketList中的每个Socket
                //将读到的内容向每个Socket发送一次
                for(Socket s : MyServer.socketList) {
                    PrintStream ps = new PrintStream(s.getOutputStream());
                    ps.println(content);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


    //定义读取客户端数据的方法
    private String readFromClient() {
        try {
            return br.readLine();
        } //如果捕获异常，则表明该Socket对应的客户端已经关闭
        catch (IOException e) {
            MyServer.socketList.remove(s);
            //删除该Socket
        }
        return null;
    }
}
