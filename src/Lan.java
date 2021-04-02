import java.util.Arrays;
import java.util.Random;
public class Lan {
    public static void main(String[] args) {
       int N=11;
        int[] arr = new int[N];
        for (int i = 0; i < arr.length-1 ; i++) {
            arr[i]=i+1;
        }
        Random random = new Random();
      int  index = random.nextInt(N-1)+1;
//      int temp= arr[arr.length-1];
        arr[arr.length-1]=arr[index];
        System.out.println(Arrays.toString(arr));

        System.out.println("*********异或运算法***********");
        int x=0;
        //将【1-10】的数依次做异或运算 得到的是【1-10】的数 【0与任何数进行异或运算得到的是数本身】
        for (int i=1;i<=N-1;i++)
        {
            x=x^i;
//            System.out.println(x);
        }
        //将上一步 异或运算的结果 与 给定的带有一重复元素的数组  的元素 依次进行异或运算  得到的就是那个重复的数字 【相同的数异或之后为0  成对的数抵消 】
        //上一步的数组异或题目给定的数组  刚好组成 N对成对的数  和一个 三个相同的数  异或操作 后  刚好的到 重复数字本身
        for (int i = 0; i < arr.length; i++) {
            x=x^arr[i];
        }
        System.out.println(x);

        System.out.println("*********辅助空间法***********");
        int[]helper= new int[N];
        for (int i = 0; i <N ; i++) {
            helper[arr[i]]++;
            if(helper[arr[i]]==2) {
                System.out.println(arr[i]);
                break;
            }
        }
    }

}
