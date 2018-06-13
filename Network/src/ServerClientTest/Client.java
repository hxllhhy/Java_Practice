package ServerClientTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException{
        Socket socket = new Socket("127.0.0.1",30000);
        //socket.setSoTimeout(10000);

        //Socket s = new Socket();
        //s.connect(new InetSocketAddress(host, port),10000);


        //将Socket对应的输入流包装成BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //通过该输入流从Socket中取出数据


        //进行普通的IO操作
        String line = br.readLine();
        System.out.println("来自服务器的数据：" + line);

        //关闭输入流，关闭Socket
        br.close();
        socket.close();
    }
}
