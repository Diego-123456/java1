
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author LENOVO-A8
 */
public class ProyectoScanner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre = "";
        int num_uno = 0 , num_dos = 0, resultado = 0;
        
        System.out.println("ingresa tu nombre");
        nombre = in.nextLine();
        
        System.out.println("ingresa el primer numero");
        num_uno = in.nextInt();
        
        System.out.println("ingresa el segundo numero");
        num_dos = in.nextInt();
        
        resultado = num_uno + num_dos;
        System.out.println("hola " + nombre + " el resultado de tu suma es:" + resultado);
        
        
    }
}
