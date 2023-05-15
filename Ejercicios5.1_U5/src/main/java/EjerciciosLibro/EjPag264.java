/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package EjerciciosLibro;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class EjPag264 {

    public static void main(String[] args) {
        
        int Arreglo[];
        
        Arreglo = new int[10];
        
        System.out.printf("%s%8s\n", "Indice", "Valor");
        
        for(int contador=0; contador <Arreglo.length; contador++){
        
            System.out.printf("%5d%8d\n", contador, Arreglo[contador]);
        }
    }
}
