public class 找出给定数组中只出现一次的元素 {
    public static void main(String[] args) {
        //给定数组 只有一个元素只出现一次  其他元素出现偶数次
        int[] arr = {1,2,3,4,5,1,2,3,4,5,8,4,7,4,5,5,8};
        //进行异或运算  得到“落单”的元素
        int alone=0;
        for (int i = 0; i <arr.length ; i++) {
            alone^=arr[i];
        }
        System.out.println(alone);
    }
}
