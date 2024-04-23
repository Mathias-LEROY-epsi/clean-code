package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private static final String DEFAULT_PATTERN = "dd/MM/yyyy HH:mm:ss";

    public static String format(Date date, String pattern) {
        if (pattern.isEmpty()) {
            pattern = DEFAULT_PATTERN;
        }
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        return formatter.format(date);
    }
}
