

//振兴中华  递归实现

public class 振兴中华 {
    public static void main(String[] args) {
        System.out.println(function(0, 0));

    }

    static int function(int x, int y) {
        if (x == 4 || y == 3) {
            return 1;
        }
        return function(x + 1, y) + function(x, y + 1);
    }

}
