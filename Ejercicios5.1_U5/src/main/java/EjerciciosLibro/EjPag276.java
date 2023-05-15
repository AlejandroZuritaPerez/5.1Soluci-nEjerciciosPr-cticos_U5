/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosLibro;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class EjPag276 {
    
    public static void main(String[] args) {
        
        int arreglo[] = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total =0;
        
        for(int numero : arreglo){
        
            total +=numero;
        }
        
        System.out.printf("Total de elementos del arrglo: %d\n", total);
    }
}
