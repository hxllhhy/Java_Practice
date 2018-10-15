package 角度和弧度的转换;

public class RadianTest {
    public static void main(String[] args) {
        System.out.println("30°对应的弧度是:" + Math.toRadians(30));
        System.out.println("π/6对应的角度是:" + Math.toDegrees(Math.PI/6));
        System.out.println("45°对应的弧度是:" + Math.toRadians(45));
        System.out.println("π/4对应的角度是:" + Math.toDegrees(Math.PI/4));
    }
}

//toRadians()将角度转换为弧度
//toDegrees()将弧度转换为角度