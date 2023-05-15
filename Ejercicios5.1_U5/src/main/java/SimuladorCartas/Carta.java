/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimuladorCartas;

/**
 *
 * @author ap550
 */
public class Carta {
    
    private String cara;
    private String palo;

    public Carta(String caraCarta, String paloCarta) {
        this.cara = caraCarta;
        this.palo = paloCarta;
    }

    public String toString(){
    
        return cara + " de " + palo;
    }
    
}
