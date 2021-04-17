
public class Find2020 {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 2020; i++) {
            String str = String.valueOf(i);

            if (str.contains("2")) {
                for (int j = 0; j < str.length(); j++) {

                    if (str.charAt(j) == '2')
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}
