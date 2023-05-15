/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosLibro;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class EjPag268 {
    
    public static void main(String[] args) {
        
        int arreglo[]= {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        
        System.out.println("Distribucion de calificaciones");
        
        for(int c=0; c<arreglo.length; c++){
        
            if(c==10)
                System.out.printf("%5d: ", 100);
            
            else
                System.out.printf("%02d-%02d: ",
                        c*10, c*10+9);
            
            
        for(int estrellas=0; estrellas<arreglo[c]; estrellas++)
        
            System.out.print("*");
            
            System.out.println();
        
        
        }
    }
}
