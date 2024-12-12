import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class Main {
    public static void main(String[] agrs){
        String cuenta = System.getProperty("user.name");
        System.out.println("cuenta = " + cuenta);

        String cuenta1 = System.getProperty("/");
        System.out.println("cuenta = " + cuenta1);

        String cuenta2 = System.getProperty("user.dir");
        System.out.println("cuenta = " + cuenta2);
        Properties p = System.getProperties();

        p.list(System.out);


    }
}