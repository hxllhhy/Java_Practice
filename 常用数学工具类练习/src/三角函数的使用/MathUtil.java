package 三角函数的使用;

public class MathUtil {
    public static void main(String[] args) {
        System.out.println("30°的正弦值:" + Math.sin(Math.PI/6));
        System.out.println("30°的余弦值:" + Math.cos(Math.PI/6));
        System.out.println("30°的正切值:" + Math.tan(Math.PI/6));

        System.out.println("0.5的反正弦值:" + Math.asin(0.5));
        System.out.println("0.866的反余弦值:" + Math.acos(0.866));
        System.out.println("0.5774的反正切值:" + Math.atan(0.5774));

        System.out.println("30的双曲正弦值:" + Math.sinh(30));
        System.out.println("30的双曲余弦值:" + Math.cosh(30));
        System.out.println("30的双曲正切值:" + Math.tanh(30));
    }

}
