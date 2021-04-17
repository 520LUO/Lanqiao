/*
 *
 * 		求子数组的最大累加和
 *
 *
 *
 *
 *
 *
 */
public class SumArr {

    //暴力破解法：

    public static void main(String[] args) {

        int[] arr = {1, -1, -5, 4, 2, 8, -3, 1, 3, 4, 5, 6, -11, 34, -43, 22, 1, -11, -23};
        int maxSum = arr[0];//子数组的最大累加和 赋初值值-》第一项 为最大sum值


        for (int i = 0; i < arr.length; i++) {//从第一项开始 ，记录以每个元素开头的子数组的累加和
            int sum = arr[i];//记录元素的累加值

            int maxI = sum;//，记录以每个元素开头的子数组的最大累加和

            for (int j = i + 1; j < arr.length; j++) {//累加以每一个元素开头的后续元素
                sum += arr[j];//累加后续元素
                if (sum > maxI)//若后面元素的累加和大于  默认记录的累加和的最大值
                    maxI = sum;  //交换
            }
            if (maxI > maxSum)//若 子数组最大累加和 大于 初始最大累加和值
                maxSum = maxI; //交换
        }

        System.out.println(maxSum);
    }

}
