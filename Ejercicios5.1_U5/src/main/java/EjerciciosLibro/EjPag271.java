/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosLibro;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class EjPag271 {
    
    public static void main(String[] args) {
        
        int respuestas[]={1, 2, 6, 4, 8, 5, 9, 7, 8, 10, 1, 6, 3, 8, 6,
            10, 3, 8, 2, 7, 6, 5, 7, 6, 8, 6, 7, 5, 6, 6, 5, 6, 7, 5, 6,
            4, 8, 6, 8, 10};
        
        int frecuencia[]= new int[11];
        
        for(int respuesta=0; respuesta<respuestas.length; respuesta++)
            ++frecuencia[respuestas[respuesta]];
        
        System.out.printf("%s%10s\n", "Calificacion", "Frecuencia");
        
        for(int calificacion=0; calificacion<frecuencia.length; calificacion++){
        
            System.out.printf("%6d%10d\n", calificacion, frecuencia[calificacion]);
        }
                
    }
}
