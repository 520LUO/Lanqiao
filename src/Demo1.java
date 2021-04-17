import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int[] arr = new int[]{1, 9, 8, 2, 3, 12, 18, 15};
        //参数1 要排序的数组     【可选】参数2 排序的起始位置start  参数3 排序的结束位置end   [start end) 左闭右开
        Arrays.sort(arr, 1, 3);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        //降序排列

        Integer[] a = {2, 3, 4, 1, 0, 6, 5};
        Arrays.sort(a, Collections.reverseOrder());
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = Integer.valueOf(a[i]);
        }
        for (int j = 0; j < res.length; j++) {
            System.out.println(res[j] + " ");
        }


        System.out.println();
        String str = Arrays.toString(arr);
        System.out.println(str);
        int[] arr1 = new int[10];
        //填充数组 [start,end) 左闭右开 区间
        Arrays.fill(arr1, 0, arr1.length, 8);
        //复制数组 参数1 原数组   参数2复制的长度
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        //复制数组 参数1 原数组   参数2 复制的起始位置   参数3复制的结束位置  [start,end) 左闭右开
        int[] arr3 = Arrays.copyOfRange(arr2, 1, arr2.length);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.asList(arr1).contains(8));
        String[] strArray = {"a", "bas", "vca"};
        //检查数组是否含有某个元素
        System.out.println(Arrays.asList(strArray).contains("bas"));
//		//连接数组
//		int comineArray = ArrayUtils.addAll(arr1,arr2);
//		//数组翻转
//		ArrayUtils.reverse(arr1);
        //打印数组

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.asList(arr2));
        Arrays.asList(arr1).stream().forEach(s -> System.out.println(s));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
        String str2 = " abcdxc dd ccd ";
        str2 = str2.trim();//去掉首位空格
        String str3 = " abcdxc dd c c d ";
        str3 = str3.replace(" ", "");//去掉所有空格
        String str4 = " abcdxc dd ccd ";
        str4 = str4.replaceAll(" ", "");
        System.out.println(str2 + "\n" + str3 + "\n" + str4);
        System.out.println(str4.indexOf("c"));
        System.out.println(str4.lastIndexOf("d"));
        System.out.println(str4.charAt(5));
        char[] strArray3 = str4.toCharArray();
        System.out.println(Arrays.toString(strArray3));
        String strHex = "10";
        int hex = 0xFF11;
        String shex = Integer.toHexString(hex);

        //16进制转为10进制
        System.out.println(Integer.valueOf(shex, 16));
        //十进制转化为二进制
        System.out.println(Integer.toString(7, 2));
        //x进制转化为y进制
        String str7 = "10";//7的7进制表示
        //将7进制转化为10进制再将十进制转化为2进制
        System.out.println(Integer.toString(Integer.valueOf(str7, 7), 2));//方法1
        System.out.println(Integer.toString(Integer.parseInt(str7, 7), 2));//方法2

        //基本数据类型转化为String类型
        int a11 = 1;
        //方法1
        String sa11 = a11 + "";
        //方法2
        String sa112 = Integer.toString(a11);
        //3
        String s3 = String.valueOf(a11);
        System.out.println(a11 + sa11 + sa112 + s3);

        //String 转化为基本类型

        int stringVale = Integer.parseInt(s3);
        Double stringDouble = Double.parseDouble(s3);
        System.err.println(stringVale + " " + stringDouble);

        //练习例子

        //将6进制数 7 转成 5进制数
        //练习基本数据类型转化为字符串型
        String str6 = String.valueOf(11);
        String result = Integer.toString(Integer.valueOf(str6, 6), 5);
        System.out.println(str6 + "\n" + result);
        //学会
    }

}
