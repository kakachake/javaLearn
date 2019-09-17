package lesson03DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02 {

    public static void main(String[] args) throws ParseException {
        f("1999-06-15");
    }

    private static void f(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date parseDate = format.parse(date);
        Date nowDate = new Date();
        System.out.println(parseDate);
        System.out.println(nowDate);
        long birth = parseDate.getTime();
        long now = nowDate.getTime();
        System.out.println(birth);
        System.out.println(now);
        long millis = now - birth;
        System.out.println(millis);
        int days = (int) (millis / 24 / 60 / 60 / 1000);
        System.out.println(days);
    }
}
