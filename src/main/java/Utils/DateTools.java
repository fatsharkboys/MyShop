package Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTools {
    public static String getDate() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(date);
    }
}
