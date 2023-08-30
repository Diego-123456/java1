/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion15;

/**
 *
 * @author LENOVO-A8
 */
public class Sesion15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Revisar el tema arreglo
        // for - while - Metodos (funciones y procedimientos)
        
        int num[] = new int[5];
        num[0] = 10;
        num[1] = 34;
        num[2] = 67;
        num[3] = 7;
        num[4] = 45;
        
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
            
        }
        // La variable va recorrer los valores del arreglo num 
        // Foreach for extendido 
        for(int var: num){
            System.out.println(var);
        }
        
                
    }
    
}
