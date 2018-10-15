package 货币金额大写格式;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertMoney {
    private final static String[] STR_NUMBER = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
    private final static String[] STR_UNIT = { "", "拾", "佰", "仟", "万", "拾", "佰", "仟", "亿", "拾", "佰", "仟" };// 整数单位
    private final static String[] STR_UNIT2 = { "角", "分", "厘" };// 小数单位

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个金额：");
        String convert = convert(sc.nextDouble());
        System.out.println(convert);
    }

    public static String convert(double d) {
        DecimalFormat df = new DecimalFormat("#0.###");
        String str = df.format(d);
        System.out.println(str);
        //判断小数点前的位数，大于12结束
        if(str.indexOf(".") != -1) {
            String num = str.substring(0, str.indexOf("."));
            if(num.length() > 12) {
                System.out.println("数字太大，不能完成转换！");
                return "";
            }
        }
        //有小数点，小数点前以元结尾
        //没有小数点，以元整结尾
        String point = "";
        if(str.indexOf(".") != -1) {
            point = "元";
        } else {
            point = "元整";
        }
        //结果就是小数点前的数+point+小数点后的数
        String result = getInteger(str) + point + getDecimal(str);

        if(result.startsWith("元")) {
            result = result.substring(1, result.length());
        }
        return result;
    }
    //获取可数部分，返回金额整数部分
    public static String getInteger(String num) {
        //截取小数点前的部分
         if(num.indexOf(".") != -1) {
             num = num.substring(0, num.indexOf("."));
         }
         //7895.123截取7895并反转为5987,长度为4
        //3090翻转为0903
         num = new StringBuffer(num).reverse().toString();
         StringBuffer temp = new StringBuffer();
        for (int i = 0; i < num.length(); i++) {
            temp.append(STR_UNIT[i]); //temp数组存储“”，十，百，千
            temp.append(STR_NUMBER[num.charAt(i)-48]); //字符本身-‘0’ = 数字序号 五九八七
            //存储""五十九百八千七
            //存储""零十九百零千三
        }
        num = temp.reverse().toString(); //七千八百九十五
        //三千零百九十零
        num = numReplace(num, "零拾", "零"); // 替换字符串的字符
        num = numReplace(num, "零佰", "零"); // 替换字符串的字符 //三千零九十零
        num = numReplace(num, "零仟", "零"); // 替换字符串的字符
        num = numReplace(num, "零万", "万"); // 替换字符串的字符
        num = numReplace(num, "零亿", "亿"); // 替换字符串的字符
        num = numReplace(num, "零零", "零"); // 替换字符串的字符
        num = numReplace(num, "亿万", "亿"); // 替换字符串的字符
        // 如果字符串以零结尾将其除去
        if (num.lastIndexOf("零") == num.length() - 1) {
            num = num.substring(0, num.length() - 1);
        }
        //三千零九十
        return num;
    }
    public static String getDecimal(String num) {
        // 判断是否包含小数点
        if (num.indexOf(".") == -1) {
            return "";
        }
        //截取小数点后的字符串123
        //01
        num = num.substring(num.indexOf(".") + 1);
        // 创建一个StringBuffer对象
        StringBuffer temp = new StringBuffer();
        // 加入单位
        for (int i = 0; i < num.length(); i++) {
            temp.append(STR_NUMBER[num.charAt(i) - 48]);
            temp.append(STR_UNIT2[i]); //角分厘
             //一角二分三厘
            //零角一分
        }
        num = temp.toString(); // 替换字符串的字符
        num = numReplace(num, "零角", "零"); // 替换字符串的字符
        num = numReplace(num, "零分", "零"); // 替换字符串的字符
        num = numReplace(num, "零厘", "零"); // 替换字符串的字符
        num = numReplace(num, "零零", "零"); // 替换字符串的字符
        // 如果字符串以零结尾将其除去
        if (num.lastIndexOf("零") == num.length() - 1) {
            num = num.substring(0, num.length() - 1);
        }
        //零一分
        return num;
    }
    public static String numReplace(String num, String oldStr, String newStr) {
        while (true) {
            if(num.indexOf(oldStr) == -1) {
                break;
            }
            num = num.replaceAll(oldStr, newStr);
        }
        return num;
    }
}
