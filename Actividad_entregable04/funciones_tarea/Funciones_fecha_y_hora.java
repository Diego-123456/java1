/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones_tarea;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author SILVIA
 */
public class Funciones_fecha_y_hora {
    public static void main(String[] args) {
        Date fecha = new Date();
        
        DateFormat formato = new SimpleDateFormat("dd-MMMM-yyyy");
        System.out.println("Hoy es: ");
        System.out.println(formato.format(fecha));
        
        Calendar fecha2 = Calendar.getInstance();
        int xdia = fecha2.get(Calendar.DAY_OF_MONTH);
        int xmes = fecha2.get(Calendar.MONTH);
        int xaño = fecha2.get(Calendar.YEAR);
        
        System.out.println("Día : "+xdia);
        System.out.println("Mes : "+xmes);
        System.out.println("Año : "+xaño);
    }
}
