
public class 将整数的奇偶位互换 {
    public static void main(String[] args) {

        int a = 6;
        int b = m(6);
        System.out.println(b);
    }

    private static int m(int i) {
        int ou = i & 0xaaaaaaaa;//和1010 1010 1010 。。。做与运算
        int ji = i & 0x55555555;//和0101 0101 0101 。。。做与运算
        return (ou >> 1) ^ (ji << 1);//结果进行异或运算得到结果
    }
}
