import java.io.*;
import java.util.Scanner;

public class 矩阵运算 {

    public static void main(String[] args) throws IOException {
        int M, N, P;
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        P = sc.nextInt();
        int[][] Ma = new int[M][N];
        int[][] Mb = new int[N][P];
        int[][] Mu = new int[M][P];
        //矩阵输入
        //输入Ma矩阵(M*N)
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                Ma[i][j] = sc.nextInt();
            }
        }
        // Mb矩阵（N*P）
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < P; j++) {
                Mb[i][j] = sc.nextInt();
            }
        }
        //矩阵乘法
        for (int i = 0; i < M; i++) {//Ma的行
            for (int j = 0; j < P; j++) {//Mb的列
                for (int k = 0; k < N; k++) {//Ma的列
                    Mu[i][j] += Ma[i][k] * Mb[k][j];
                }
            }
        }

        //矩阵加法
        //从文件读取矩阵 m1(X*Y),m2(X*Y)

        char[][] m1 = new char[4][];
        char[][] m2 = new char[4][];

//       int[][] m1={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
//       int [][] m2={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int[][] m3 = new int[4][4];
        int cur1 = 0;
        int cur2 = 0;
        File file1 = new File("/Users/luoshaosong/Desktop/text.txt");
        File file2 = new File("/Users/luoshaosong/Desktop/text2.txt");
        BufferedReader bf1 = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
        BufferedReader bf2 = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
        String s = "";

        while ((s = bf1.readLine()) != null) {

            m1[cur1++] = s.replace(" ", "").toCharArray();

        }
        while ((s = bf2.readLine()) != null) {

            m2[cur2++] = s.replace(" ", "").toCharArray();

        }

        //相加：
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++)
                m3[i][j] = Character.digit(m1[i][j], 10) + Character.digit(m2[i][j], 10);
//                m3[i][j]=m1[i][j]+m2[i][j];
        }

        print(Mu);
        print(m3);


    }

    static void print(int[][] Mu) {
        //输出
        for (int i = 0; i < Mu.length; i++) {
            for (int j = 0; j < Mu[i].length; j++) {
                if (j == Mu[i].length - 1)
                    System.out.println(Mu[i][j]);
                else
                    System.out.print(Mu[i][j] + " ");
            }
        }
    }

}
