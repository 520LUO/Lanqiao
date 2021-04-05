public class F0_1浮点数的二进制表示 {
    public static void main(String[] args) {
        double num = 0.625;
        StringBuilder stringBuilder = new StringBuilder("0.");
        while (num > 0) {
            //×2 挪整
            double r = num * 2;
            if (r >= 1) {
                stringBuilder.append("1");
                //消除整数部分
                num = r - 1;
            } else {
                stringBuilder.append("0");
                num = r;
            }
            if (stringBuilder.length() > 34) {
                System.out.println("ERROR");
                return;
            }
        }
        System.out.println(stringBuilder.toString());

    }
}
