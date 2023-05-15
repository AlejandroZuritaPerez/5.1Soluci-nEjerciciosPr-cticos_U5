/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosLibro;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class EjPag266 {
    
    public static void main(String[] args) {
        
        final int LONGITUD_ARREGLO = 10; 
        int arreglo[]= new int[LONGITUD_ARREGLO];
        
        for(int c=0; c<arreglo.length; c++){
        
            arreglo[c]= 2+2*c;
        }
        
        System.out.printf("%s%8s\n", "Indice", "Valor");
        
        for(int c=0; c<arreglo.length; c++){
        
            System.out.printf("%5d%8d\n", c, arreglo[c]);
        }
    }
}
