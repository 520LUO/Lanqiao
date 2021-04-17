import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        Date date1 = new Date(3994567L);


        System.out.println(date1);
        System.out.println(System.currentTimeMillis());
        System.out.println(date.getTime());
        //抽象类 Calendar  不能直接new创建  通过 静态 getInstance()创建 返回子类Calendar对象
        Calendar calendar = Calendar.getInstance(); // 如果不设置时间，则默认为当前时间
        calendar.setTime(new Date()); // 将系统当前时间赋值给 Calendar 对象
        System.out.println("现在时刻：" + calendar.getTime()); // 获取当前时间
        int year = calendar.get(Calendar.YEAR); // 获取当前年份
        System.out.println("现在是" + year + "年");
        int month = calendar.get(Calendar.MONTH) + 1; // 获取当前月份（月份从 0 开始，所以加 1）
        System.out.print(month + "月");
        int day = calendar.get(Calendar.DATE); // 获取日
        System.out.print(day + "日");
        int week = calendar.get(Calendar.DAY_OF_WEEK) - 1; // 获取今天星期几（以星期日为第一天）
        System.out.print("星期" + week);
        int hour = calendar.get(Calendar.HOUR_OF_DAY); // 获取当前小时数（24 小时制）
        System.out.print(hour + "时");
        int minute = calendar.get(Calendar.MINUTE); // 获取当前分钟
        System.out.print(minute + "分");
        int second = calendar.get(Calendar.SECOND); // 获取当前秒数
        System.out.print(second + "秒");
        int millisecond = calendar.get(Calendar.MILLISECOND); // 获取毫秒数
        System.out.print(millisecond + "毫秒");
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); // 获取今天是本月第几天
        System.out.println("今天是本月的第 " + dayOfMonth + " 天");
        int dayOfWeekInMonth = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH); // 获取今天是本月第几周
        System.out.println("今天是本月第 " + dayOfWeekInMonth + " 周");
        int many = calendar.get(Calendar.DAY_OF_YEAR); // 获取今天是今年第几天
        System.out.println("今天是今年第 " + many + " 天");
        Calendar c = Calendar.getInstance();
        c.set(2012, 8, 8); // 设置年月日，时分秒将默认采用当前值
        System.out.println("设置日期为 2012-8-8 后的时间：" + c.getTime()); // 输出时间
        System.out.println(date.getDate() + " " + date.getDay() + " " + date.getHours());
        //格式化时间日期
//		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String s = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒").format(date);
        System.out.println(s);
        //解析文本为日期类
        //parse方法
        try {
            Date date2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒").parse(s);
            System.out.println(date2);
        } catch (Exception e) {
            // TODO: handle exception
        }

        String f = new DecimalFormat("00.000").format(3.14);
        System.out.println(f);

        //获取今年的年龄
        System.out.println("输入你的出生日期：格式为 yyyy-MM-dd");
        String sage = new Scanner(System.in).next();
        Date age = new SimpleDateFormat("yyyy-MM-dd").parse(sage);
        if (age.getMonth() <= date.getMonth())
            System.out.println("今年你已经 " + (date.getYear() - age.getYear()) + "岁" + (date.getMonth() - age.getMonth()) + "月");
        else {
            System.out.println("今年你已经 " + (date.getYear() - age.getYear() - 1) + "岁" + (12 - age.getMonth() + date.getMonth()) + "个月");
        }
    }

}
