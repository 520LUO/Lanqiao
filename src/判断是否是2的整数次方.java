import java.util.Scanner;

public class 判断是否是2的整数次方 {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        //是2的整数次方：2进制位中只能有一个 1  进行 -1 再进行&运算后，二进制位的最低位的1被消除   结果若为0 表示只有一位为1
        if (((x - 1) & x) == 0) {
            System.out.printf("%d是2的整数次方数", x);
        }

    }
}
