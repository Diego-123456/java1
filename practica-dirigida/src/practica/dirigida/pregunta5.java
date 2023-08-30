/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.dirigida;

/**
 *
 * usando metodo
 */
public class pregunta5 {
    public static void main(String[] args) {
        float num[] = {12, 45, 13, 67, 1.62f, 7, 14, 9, 56.7f};
        // Llama al metodo void listar 
        // Llama a la funcion listar
        listar(num);
        
        float numeros[] = {120, 45, 138, 67, 1, 862f, 459, 57, 146, 9, 56, 7f};
        listar(numeros);
        
    }
    //nada
    //each
    private static void listar(float nm[]){
        for (float x: nm){
            System.out.println(x);
        }

   
    }
        
    

  
}

    
    
    

