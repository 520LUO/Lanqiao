//走梯子
//递归

public class Ti {
    public static void main(String[] args) {
        int N = 3;
        System.out.println(sumRoute(N));

    }

    static int sumRoute(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        return sumRoute(n - 1) + sumRoute(n - 2);

    }

}
