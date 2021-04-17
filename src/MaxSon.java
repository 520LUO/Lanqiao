import java.util.Scanner;

/*
 * 给定N*N矩阵  只有 0 和 1 两种值
 * 返回边框全是1 的最大    正   方形 的边长
 *
 *
 *
 * 输入：
 * 0 1 1 1 1
 * 0 1 0 0 1
 * 0 1 0 0 1
 * 0 1 1 1 1
 * 0 1 0 1 1
 *
 *
 * 输出：
 *
 * 4
 *
 *
 */
public class MaxSon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int n = N;
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }

        }

        while (n > 0) {
            l3:
            for (int i = 0; i < N; i++) {
                if (i + n > N) break;
                for (int j = 0; j < N; j++) {
                    if (j + n > N) break;
                    int r = i, c = j;
                    //下
                    while (c < j + n) {
                        if (matrix[r][c++] == 0)
                            continue l3;
                    }
                    c--;
                    //右
                    while (r < i + n) {
                        if (matrix[r++][c] == 0)
                            continue l3;
                    }
                    r--;

                    //上
                    while (c >= j) {
                        if (matrix[r][c] == 0)
                            continue l3;
                        c--;
                    }
                    c++;
                    //左
                    while (r >= i) {
                        if (matrix[r][c] == 0)
                            continue l3;
                        r--;

                    }
                    r++;

                    System.out.println(n);
                    System.exit(-1);
                }

            }
            n--;
        }
    }

}
