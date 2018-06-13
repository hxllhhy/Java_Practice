public class StringConcatenate {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            String result = "This is testing the difference between String and StringBuffer";
        }

        long endTime1 = System.currentTimeMillis();
        System.out.println("字符串连接---使用+操作符:" + (endTime1 - startTime1) + "ms");

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            StringBuffer result = new StringBuffer();
            result.append("This is");
            result.append("testing the");
            result.append("difference");
            result.append("between");
            result.append("String");
            result.append("and");
            result.append("StringBuffer");
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("字符串连接---使用StringBuffer:" + (endTime2 - startTime2) + "ms");
    }
}
//"+"为每个字符串变量赋值，公用一个内值，占用一份内存空间；
//"StringBuffer"每次新建一个新对象，内存分配新的空间，新分配5000份内存空间；
