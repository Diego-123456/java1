/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.ii01;


/**
 *
 * Ingrese un nombre y luego mostrar el primer y el ultimo caracter del nombre en mayuscula 
 * 
 */
public class PRACTICAII01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String xnom, xapellido;
        char xprimer; 
        char xseptimo;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese nombre");
        xnom = sc.nextLine(); // Remigio
        
        xprimer = xnom.charAt(0);
        xseptimo = xnom.charAt(0);
        
        
      
       
        
        System.out.println("El nombre es : "+ xprimer+". "+xseptimo);
                
        
        
    }
    
}
