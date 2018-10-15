package 用字符串构建器追加字符;

public class AppendCharacter {
    public static void main(String[] args) {
        String appendStr = "";
        long startTime = System.nanoTime(); //开始计时
        for (int i = 20000; i < 50000; i++) {
            appendStr += (char)i;
        }
        long endTime = System.nanoTime(); //结束计时
        System.out.println("String追加字符3万个!");
        System.out.println("用时:" + (endTime-startTime)/1000000d + "ms");
        
        StringBuilder sb = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 20000; i < 50000; i++) {
            sb.append((char)i);
        }
        endTime = System.nanoTime();
        System.out.println("字符串构建器追加字符3万个!");
        System.out.println("用时:" + (endTime-startTime)/1000000d + "ms");
    }
}
