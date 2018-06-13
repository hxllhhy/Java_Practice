package MultiThreadCSChatRoom.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyServer {

    //定义保存所有Socket的ArrayList，并将其包装为线程安全的
    public static List<Socket> socketList = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(30000);
        while (true) {
            Socket s = ss.accept(); //客户端Socket连接到ServerSocket
            socketList.add(s);   //将对应Socket加入socketList中保存
            new Thread(new ServerThread(s)).start(); //启动一个线程
        }
    }
}
