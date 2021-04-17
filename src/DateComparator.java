import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class DateComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date d1 = null;
        Date d2 = null;
        try {
            d1 = df.parse(s1);
            d2 = df.parse(s2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        assert d1 != null;
        assert d2 != null;
        return d1.compareTo(d2);
    }
}