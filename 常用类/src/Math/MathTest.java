package Math;

public class MathTest {
    public static void main(String[] args) {

        /*--------------------三角运算--------------------*/
        System.out.println("Math.toDegrees(1.57):" + Math.toDegrees(1.57));
        //弧度转换成角度
        System.out.println("Math.toRadians(90):" + Math.toRadians(90));
        //角度转换成弧度
        System.out.println("Math.acos(1.2):" + Math.acos(1.2));
        System.out.println("Math.asin(0.8):" + Math.asin(0.8));
        System.out.println("Math.atan(2.3):" + Math.atan(2.3));
        //计算反余弦、反正弦、反正切
        System.out.println("Math.cos(1.57):" + Math.cos(1.57));
        System.out.println("Math.sin(1.57):" + Math.sin(1.57));
        System.out.println("Math.tan(0.8):"  + Math.tan(0.8));
        //计算余弦、正弦、正切
        System.out.println("Math.cosh(1.2):" + Math.cosh(1.2));
        System.out.println("Math.sinh(1.2):" + Math.sinh(1.2));
        System.out.println("Math.tanh(2.1):" + Math.tanh(2.1));
        //计算双曲余弦、双曲正弦、双曲正切
        System.out.println("Math.atan2(0.1,0.2):" + Math.atan2(0.1,0.2));
        //将矩形坐标（x，y）转换成极坐标（r，thet）

        /*--------------------取整运算--------------------*/
        System.out.println("Math.floor(-1.2):" + Math.floor(-1.2));
        //取整，返回小于目标数的最大整数
        System.out.println("Math.ceil(1.2):" + Math.ceil(1.2));
        //取整，返回大于目标数的最小整数
        System.out.println("Math.round(2.3):" + Math.round(2.3));
        //四舍五入取整

        /*----------------乘方、开方、指数运算---------------*/
        System.out.println("Math.sqrt(2.3):" + Math.sqrt(2.3));
        //计算平方根
        System.out.println("Math.cbrt(9):" + Math.cbrt(9));
        //计算立方根
        System.out.println("Math.exp(2):" + Math.exp(2));
        //返回e的n次幂
        System.out.println("Math.hypot(4,4):" + Math.hypot(4, 4));
        //返回sqrt(x方+y方)
        System.out.println("Math.IEEEremainder(5,2):" + Math.IEEEremainder(5, 2));
        //按照IEEE754标准的规定，对两个参数进行余数运算
        System.out.println("Math.pow(3,2):" + Math.pow(3,2));
        //计算乘方
        System.out.println("Math.log(12):" + Math.log(12));
        //计算自然对数
        System.out.println("Math.1og10(9):" + Math.log10(9));
        //计算底数为10的对数
        System.out.println("Math.log1p(9):" + Math.log1p(9));
        //计算参数与1之和的自然对数

        /*------------------符号相关的运算-----------------*/
        System.out.println("Math.abs(-4.5):" + Math.abs(-4.5));
        //计算绝对值
        System.out.println("Math.copySign(1.2, -1.0):" + Math.copySign(1.2, -1.0));
        //符号赋值，返回带有第二个浮点数符号的第一个浮点参数
        System.out.println("Math.signum(2.3):" + Math.signum(2.3));
        //符号函数，如果参数为0返回0，参数大于0返回1.0，参数小于0返回-1.0

        /*------------------大小相关的运算-----------------*/
        System.out.println("Math.max(2.3,4.5):" + Math.max(2.3,4.5));
        //找出最大值
        System.out.println("Math.min(1.2,3.4):" + Math.min(1.2,3.4));
        //找出最小值
        System.out.println("Math.nextAfter(1.2,1.0):" + Math.nextAfter(1.2,1.0));
        //返回第一个参数和第二个参数之间与第一个参数相邻的浮点数
        System.out.println("Math.nextUp(1.2):" + Math.nextUp(1.2));
        //返回比目标数略大的浮点数
        System.out.println("Math.random():" + Math.random());
        //返回一个伪随机数，该值大于等于0.0且小于1.0
    }
}
