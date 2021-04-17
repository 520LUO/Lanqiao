import java.util.Scanner;

public class 压缩字符串 {


    /*
    输入： aabbccddeeffgggg
    输出： a2b2c2d2e2f2g4
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = new Scanner(System.in).next();
        char last = 0;//上一个字符
        int count = 0;//计数
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (sb.length() == 0) {
                sb.append(charAt);
                count++;
            } else {
                if (last == s.charAt(i))
                    count++;
                else {
                    sb.append(count).append(charAt);
                    count = 1;    //重置为1
                }
            }
            last = charAt;
        }
        //最后一个字符的重复次数
        if (count >= 1) {
            sb.append(count);
        }
        if (sb.length() >= s.length())
            System.out.println(s);
        else
            System.out.println(sb.toString());
    }


}
