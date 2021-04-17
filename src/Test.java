
//蛇形填数
public class Test {
    public static void main(String[] args) {
        int[][] arr = new int[100][100];
        int curx = 1;//定义横坐标x的位置
        int cury = 1;//纵坐标y的位置
        int ans = 0;//目前排到哪个数了
        arr[curx][cury] = ++ans;//初始化第一个值
        while (arr[20][20] == 0)//当我们的目标值已经被填充时退出循环
        {
            arr[curx][++cury] = ++ans;//右填一位。然后开始左下递推
            while (cury > 1)//左下递推的规律是x增加，y减少，终止标志是y减少到1,等于1时就该退出循环了
            {
                arr[++curx][--cury] = ++ans;
            }
            arr[++curx][cury] = ++ans;//下移一位，然后开始右上递推
            while (curx > 1)//右上递推的规律是x减少，y增加，终止标志是x减少到1，等于1时就该退出循环了
            {
                arr[--curx][++cury] = ++ans;
            }


        }
        System.out.println(arr[20][20]);
    }

}
