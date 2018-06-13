public class StringRegionMatch {
    public static void main(String[] args) {
        String str1 = "Welcome to Microsoft";
        String str2 = "I work with microsoft";

        //将str1字符串从第11个字符"M"开始和str2字符串的第12个字符"M"开始逐个比较共比较9对字符
        //由于字符串区分大小写，所以结果为false。
        boolean match1 = str1.regionMatches(11,str2,12,9);

        //true表示忽略大小写
        boolean match2 = str1.regionMatches(true,11,str2,12,9);
        System.out.println(match1);
        System.out.println(match2);

    }
}
