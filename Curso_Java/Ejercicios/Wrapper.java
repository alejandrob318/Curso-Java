import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Main{
    public static void main(String[] agrs){
        Date fecha = new Date();
        System.out.println(fecha);

        SimpleDateFormat fechaa = new SimpleDateFormat("dd MM,yyyy");
        System.out.println(fechaa.format(fecha));
        // solo se puede usar con arreglo y objetos
        //for (int numero : 1000){

        //}

        //
        int j = 0;
        for (int i = 0; i< 100;i++){
            j+= i;
        }
        Date fechaFin = new Date();

        long tiempo = fechaFin.getTime() - fecha.getTime();

        System.out.println("tiempo = " + tiempo);

        Calendar
    }
}