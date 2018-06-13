package 序列化;
import java.io.*;

public class UseStudent {
    public static void main(String[] args) {
        Student st = new Student("Tom", 'M', 20, 3.6);
        File file = new File("./student.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(st);
            oos.flush();
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s1 = (Student) ois.readObject();
            System.out.println(s1.getName() + " " + s1.getSex() + " " + s1.getYear() + " " + s1.getGpa());
            ois.close();
            fis.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
