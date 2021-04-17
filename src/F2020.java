import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class F2020 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/luoshaosong/Desktop/text.txt")));
        String s = "";
        char[][] arr = new char[8][];
        int cur = 0;
        int ans = 0;
        while ((s = bf.readLine()) != null) {
            arr[cur++] = s.toCharArray();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == '2') {
                    if (i < arr.length - 3 && arr[i + 1][j] == '0' && arr[i + 2][j] == '2' && arr[i + 3][j] == '0')
                        ans++;//从上往下看
                    if (j < arr[i].length - 3 && arr[i][j + 1] == '0' && arr[i][j + 2] == '2' && arr[i][j + 3] == '0')
                        ans++;//从左往右看
                    if (i < arr.length - 3 && j < arr[i].length - 3 && arr[i + 1][j + 1] == '0' && arr[i + 2][j + 2] == '2' && arr[i + 3][j + 3] == '0')
                        ans++;//斜着看
                }
            }
        }
        System.out.println(ans);
    }
}
