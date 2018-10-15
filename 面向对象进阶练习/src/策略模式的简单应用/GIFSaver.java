package 策略模式的简单应用;

public class GIFSaver implements ImageSaver {
    @Override
    public void save() {
        System.out.println("将图片保存为GIF格式");
    }
}
