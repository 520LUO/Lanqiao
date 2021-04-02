import java.util.Scanner;

public class 二进制数1的个数 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        System.out.println(Integer.toString(N,2));
        //方法1
        int count=0;
        //将1左移i位   比对每一位是否是 1
        for (int i = 0; i <32 ; i++) {
            if((N&(1<<i))==(1<<i))
                count++;
        }
        System.out.println("**********方法1*********\n"+count);

        //方法2：
         int count1=0;
        while(N!=0)
        {
            //N-1 和 N 做&运算 效果是 消去最低位的  1
            N=((N-1)&N);
            count1++;
        }
        System.out.println("**********方法2*********\n"+count1);


    }
}
