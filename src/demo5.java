import java.util.*;

public class demo5 {
    public static void main(String[] args) {


        //创建集合对象 Collecton集合
        Collection<String> collection = new ArrayList<>();
        System.out.println(collection);
        //add（）方法
        collection.add("张三");
        collection.add("张一");
        collection.add("张二");
        collection.add("张四");
        collection.add("张五");
        collection.remove("张一");
        System.out.println(collection.contains("张三"));
//	collection.clear();//清除集合元素
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
        //集合转化为数组
        Object[] array = collection.toArray();
        //普通for遍历数组
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("-------------------");
        //增强for遍历-----》实现原理还是迭代器
        for (Object object : array) {
            System.out.println(object);
        }
        System.out.println("-------------------");
        //使用迭代器遍历集合
        for (Iterator<String> iterator = collection.iterator(); iterator.hasNext(); ) {
            String string = (String) iterator.next();
            System.out.println(string);

        }
        System.out.println("-------------------");
        //使用while循环的迭代器遍历
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            String string1 = (String) it.next();
            System.out.println(string1);
        }


        //List集合

        /* List集合（ArrayList，LinkedList）
         * 1.有序的集合
         * 2.有索引
         * 3.允许重复
         * 带索引的特e有方法：
         * public void add(int index ,E element);指定元素添加到集合的指定位置
         * public E    get(int index);返回指定位置的元素
         * public E    remove(int index);移除指定位置的元素			返回的是被移除的元素
         * public E    set(int index ,E element);替换指定位置的元素   返回替换前的元素
         *
         * */

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("C");
        list.add("D");

        list.add(0, "A");
        System.out.println(list.get(0));

        list.remove(2);
        list.set(3, "d");
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
            String string = (String) iterator.next();
            System.out.print(string + "\t");
        }


        /*
         * ArrayList  底层是数组  查询快  增删慢
         *
         * LinkedList  底层是链表  查询慢  增删快    不能使用多态
         * LinkedList的特有方法：
         * public void addFirst（E e）
         * public void addLast（E e）
         * public void push（E e） 将此元素推到列表的堆栈中
         *
         *
         * public E getFirst（）
         * public E getLast（）
         *
         * public E removeFirst（）//移除并返回列表的第一个元素
         * public E removeLast（）//移除并返回列表的最后一个元素
         * public E pop() //从此列表中所表示的堆栈中弹出一个元素
         */
        LinkedList<String> link = new LinkedList<>();
        link.push("#1");
        link.addFirst("#0");
        link.add("#2");
        link.addLast("#3");
        link.removeFirst();
        link.removeLast();//移除最后一个数组
        link.pop();//移除最后一个元素
        System.out.println(link.getLast());
        System.out.println(link.isEmpty());

        link.pop();
        System.out.println(link);


//	Vector集合  底层也是数组  同步的 单线程  效率低

    }

}
