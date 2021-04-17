
/*马虎的算式*/


/*枚举暴力破解法*/

public class Mahu {
    public static void main(String[] args) {

        int count = 0;
        for (int a = 1; a < 10; a++) {

            for (int b = 1; b < 10; b++) {
                if (b != a)
                    for (int c = 1; c < 10; c++) {
                        if (c != b && c != a)
                            for (int d = 1; d < 10; d++)
                                if (d != a && d != b && d != c)
                                    for (int e = 1; e < 10; e++) {
                                        if (e != a && e != b && e != c && e != d && ((a * 10 + b) * (c * 100 + d * 10 + e) == (a * 100 + d * 10 + b) * (c * 10 + e)))
                                            count++;
                                    }
                    }
            }
        }

        System.out.println(count);
    }

}
