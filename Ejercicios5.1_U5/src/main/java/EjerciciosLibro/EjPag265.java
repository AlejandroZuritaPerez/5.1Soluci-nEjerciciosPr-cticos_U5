/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosLibro;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class EjPag265 {
    
    public static void main(String[] args) {
        
        int arreglo[] = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
        
        System.out.printf("%s%8s\n", "Indice", "Valor");
        
        for(int c=0; c<arreglo.length; c++){
        
            System.out.printf("%5d%8d\n", c, arreglo[c]);
        }
    }
}
