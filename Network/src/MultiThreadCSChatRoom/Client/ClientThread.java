package MultiThreadCSChatRoom.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientThread implements Runnable {
    //该线程负责处理的Socket
    private Socket s;

    //该线程负责处理的Socket对应的输入流
    BufferedReader br = null;

    public ClientThread(Socket s) throws IOException {
        this.s = s;
        br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    }

    @Override
    public void run() {
        try {
            String content = null;
            while((content = br.readLine()) != null) {
                System.out.println(content);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
