import java.util.Arrays;
import java.util.Scanner;

/*
 * 将矩阵中0所在的行和列清零
 *
 *
 *  输入：3*4矩阵
 *
 *  1 2 3 4
 *  5 6 7 0
 *  0 3 4 8
 *
 *  输出：
 *
 *  0 2 3 0
 *  0 0 0 0
 *  0 0 0 0
 *
 *
 * */
public class ClearZero {


    public static void main(String[] args) {
        int m = 3, n = 4;
        int[][] matrix = new int[m][n];
        int[][] flag = new int[m][n];
        Scanner sc = new Scanner(System.in);
        //接收 用户输入的矩阵
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = sc.nextInt();

                //记录为0的坐标
                if (matrix[i][j] == 0) {
                    flag[i][j] = 1;
                }

            }
        }

        //清除0所在的行和列

        for (int i = 0; i < flag.length; i++) {
            for (int j = 0; j < flag[0].length; j++) {
                if (flag[i][j] == 1) {
//				for(int k=0;k<n;k++)
//					//清除行
//					matrix[i][k]=0;


                    for (int k = 0; k < m; k++)
                        //清除列
                        matrix[k][j] = 0;
                    //清除行
                    Arrays.fill(matrix[i], 0);

                }
            }
        }

        //输出矩阵
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3)
                    System.out.println(matrix[i][j]);
                else
                    System.out.print(matrix[i][j] + " ");
            }
        }

    }

}
