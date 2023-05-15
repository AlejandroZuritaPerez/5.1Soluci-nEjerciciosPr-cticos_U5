/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibroDeCalificaciones;

/**
 *
 * @author ap550
 */
public class PruebaLibroCalificaciones {

    public static void main(String[] args) {
        
        int arregloCAlif[]={ 87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones(
            "CS101 INTRODUCCION A LA PROGRAMACION EN JAVA", arregloCAlif);
        
        miLibroCalificaciones.mostrarMensaje();
        miLibroCalificaciones.procesarCalificaciones();
    }
}
