/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosLibro;

import java.util.Random;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class EjPag269 {
    
    public static void main(String[] args) {
        
        Random NA = new Random();
        int frecuencia[]= new int[7];
        
        for(int tiro=1; tiro<=6000; tiro++){
            ++frecuencia[1+NA.nextInt(6)];

        }
         System.out.printf("%s%10s\n", "Cara", "Frecuencia");
         
        for(int cara=1; cara<frecuencia.length; cara++)
        
            System.out.printf("%4d%10d\n", cara, frecuencia[cara]);
        
    }
}
