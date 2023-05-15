/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimuladorCartas;

/**
 *
 * @author ap550
 */
public class PruebaPaqueteDeCartas {
    
    public static void main(String[] args) {
        
        PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
        miPaqueteDeCartas.barajar();
        
        for(int i=0; i<13; i++){
        
            System.out.printf("%-20s%-20s%-20s%-20s\n",
                    miPaqueteDeCartas.repartirCarta(), miPaqueteDeCartas.repartirCarta(),
                    miPaqueteDeCartas.repartirCarta(), miPaqueteDeCartas.repartirCarta());
        }
    }
}
