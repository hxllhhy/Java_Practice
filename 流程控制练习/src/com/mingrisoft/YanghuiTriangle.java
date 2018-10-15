package com.mingrisoft;

public class YanghuiTriangle {
    public static void main(String[] args) {
        //创建二维数组
        int triangle[][] = new int[10][];
        //遍历二维数组的第一层
        for (int i = 0; i < triangle.length; i++) {
            //初始化第二层数组的大小
            triangle[i] = new int[i+1];
            //遍历第二层数组
            for (int j = 0; j <= i; j++) {
                if(i == 0 || j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i-1][j] + triangle[i-1][j-1];
                }
                System.out.print(triangle[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
