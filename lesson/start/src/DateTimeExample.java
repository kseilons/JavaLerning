package start.src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeExample {
    public static void main(String[] args) {
        Date date = DateTimeExample.parseDateFromParam(args);
        System.err.println(date);
        DateTimeExample dateTimeExample = new DateTimeExample();
        date = dateTimeExample.addSomeTime(date);
        dateTimeExample.printDate(date);
    }

    public void printDate(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        System.err.println(simpleDateFormat.format(date));
    }

    public Date addSomeTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, 1);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar.getTime();
    }

    static Date parseDateFromParam(String[] args) throws  IllegalArgumentException{
        if (args.length != 1) {
            throw  new IllegalArgumentException("Неверное кол-во аргументов. Ожидается 1 аргумент");
        }
        String dateToParse = args[0];
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try{
            Date date = simpleDateFormat.parse(dateToParse);
            return date;
        } catch(ParseException e) {
            throw new IllegalArgumentException("Неверный формат даты. Ожидается формат dd/MM/yyyy HH:mm", e);
        }
    }
}
