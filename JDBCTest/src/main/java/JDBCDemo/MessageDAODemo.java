package JDBCDemo;

import java.util.Scanner;

import static java.lang.System.out;


public class MessageDAODemo {
    public static void main(String[] args){
        MessageDAO dao = new MessageDAO(
                "jdbc:mysql://localhost:3306/test",
                "root", "24865");
        Scanner console = new Scanner(System.in);
        while(true)
        {
            out.print("(1)显示留言 (2)新增留言: ");
            switch(Integer.parseInt(console.nextLine())){
                case 1:
                    dao.get().forEach(message -> {
                        out.printf("%d\t%s\t%s\t%s\n",
                                message.getId(),
                                message.getName(),
                                message.getEmail(),
                                message.getMsg());
                    });
                    break;
                case 2:
                    out.print("姓名: ");
                    String name = console.nextLine();
//                    out.print(name);
                    out.print("邮件: ");
                    String email = console.nextLine();
                    //out.print(email);
                    out.print("留言: ");
                    String msg = console.nextLine();
                    //out.print(msg);
                    dao.add(new Message(name, email, msg));
            }
        }
    }
}
