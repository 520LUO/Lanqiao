import java.util.Scanner;

public class 判断重复字符 {
    public static void main(String[] args) {
        int[] flag = new int[128];
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if (flag[c] > 0) {
                System.out.println("存在相同字符！");
                break;
            } else
                flag[c]++;
            if (i == s.length() - 1)
                System.out.println("该字符串不存在相同字符");
        }


    }
}
