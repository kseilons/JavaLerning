package start.src;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class DateTime {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -1);
        System.out.println(calendar.getTime());
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormat.format(calendar.getTime()));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        Date newDate = simpleDateFormat.parse("05/12/1985");
        System.out.print(newDate);
    }
}
