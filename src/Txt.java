import java.io.*;

public class Txt {
    static String[][] group = new String[3][500];

    public static void main(String[] args) throws IOException {
        int count = 0;
        String[] a = solve("/Users/luoshaosong/Desktop/A.txt", 0);
        String[] b = solve("/Users/luoshaosong/Desktop/B.txt", 1);
        String[] c = solve("/Users/luoshaosong/Desktop/C.txt", 2);

        for (int i = 0; a[i] != null; i++) {
            for (int j = 0; b[j] != null; j++) {
                if (a[i].equals(b[j])) {
                    for (int k = 0; c[k] != null; k++) {
                        if (!(a[i].equals(c[k]))) {
                            count++;
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(count);

    }

    static String[] solve(String path, int gId) throws IOException {
        File file = new File(path);
        int cur = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String s = "";
        String[] rowStrings;
        while ((s = reader.readLine()) != null) {
            rowStrings = s.replace(" ", "").split(",");
            for (int i = 0; i < rowStrings.length; i++) {
                group[gId][cur++] = rowStrings[i];
            }
        }
        reader.close();
        return group[gId];
    }

}
