import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/luoshaosong/Desktop/text2");
        BufferedReader rd = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        char a[][] = new char[4][];
        int[][] b = {{1, 2, 3, 4}, {1, 2, 3}};
        int cur = 0;
        String s = "";
        while ((s = rd.readLine()) != null) {
            a[cur++] = s.replace(" ", "").toCharArray();
        }
    }
}
