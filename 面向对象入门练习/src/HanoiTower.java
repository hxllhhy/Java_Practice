public class HanoiTower {
    public static void main(String[] args) {
        int nDisks = 3;
        moveDish(nDisks, 'A', 'B', 'C');
    }
    public static void moveDish(int level, char A, char B, char C) {
        if(level == 1) {
            System.out.println("从" + A + "移动盘子1号到" + C);
        } else {
            moveDish(level-1, A, C, B); //将n-1个盘子由A移动到B，以C为辅助柱子
            System.out.println("从" + A + "移动盘子" + level + "号到" + C); //将A下的最后一个盘子移动到C
            moveDish(level-1, B, A, C); //将n-1个盘子由B移动到C，以A为辅助柱子
        }
    }
}
