
package clases;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class horayfecha {

    Calendar fecha = new GregorianCalendar();

    String anio = Integer.toString(fecha.get(Calendar.YEAR));
    String mes = Integer.toString(fecha.get(Calendar.MONTH));
    String dia = Integer.toString(fecha.get(Calendar.DATE));

    public String fechaCompleta = dia + "-" + mes + "-" + anio;

    String hora = Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
    String minutos = Integer.toString(fecha.get(Calendar.MINUTE));
    String segundos = Integer.toString(fecha.get(Calendar.SECOND));

   public String horaCompleta = hora + ":" + minutos + ":" + segundos;

}
