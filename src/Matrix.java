/*顺序打印二维数组：
 *
 * 输入：
 * 1   2    3     4
 * 5   6    7     8
 * 9  10   11    12
 * 13 14   15    16
 *
 *
 *
 * 输出：
 * 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 *
 */

public class Matrix {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        print(matrix);
    }

    static void print(int[][] matrix) {
        int index = 0;
        int x = 0;//所在行数
        int y = 0;//所在列数

        //首先 打印 【0，0】位置的数
        System.out.print(matrix[x][y] + "\t");
        //循环每行的顺时针打印
        while (index < matrix.length) {
            //往左打印行
            while (y < matrix[0].length - 1 - index)
                System.out.print(matrix[x][++y] + "\t");

            //往下打印列
            while (x < matrix.length - 1 - index)

                System.out.print(matrix[++x][y] + "\t");

            //往左打印行
            while (y > index)
                System.out.print(matrix[x][--y] + "\t");

            //往上打印列
            while (x > index + 1)
                System.out.print(matrix[--x][y] + "\t");

            //再从下一行开始
            index++;
        }


    }

}
