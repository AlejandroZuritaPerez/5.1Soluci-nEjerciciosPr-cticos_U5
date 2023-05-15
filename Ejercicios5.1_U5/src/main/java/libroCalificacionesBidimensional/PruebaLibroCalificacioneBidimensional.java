/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libroCalificacionesBidimensional;

/**
 *
 * @author ap550
 */
public class PruebaLibroCalificacioneBidimensional {
    
    public static void main(String[] args) {
        
        int arregloCalif[][]={{87, 96, 70},
                              {68, 87, 90},
                              {94, 100, 90},
                              {100, 81, 82},
                              {83, 65, 85},
                              {78, 87, 65},
                              {85, 75, 83},
                              {91, 94, 100},
                              {76, 72, 84},
                              {87, 93, 73}};
        
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones(
        "CS101 INTRODUCCION A LA PROGRAMACION EN JAVA", arregloCalif);
        miLibroCalificaciones.mostrarMensaje();
        miLibroCalificaciones.procesarCalificaciones();
    }
}
