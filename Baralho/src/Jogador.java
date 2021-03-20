/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baralho;

/**
 *
 * @author FELPs
 */
public class Jogador {
    
    private Cartas cartasJogador[];
    Cartas maiorCarta = new Cartas();

    public Jogador(int qtdeCartasJogador) {
        this.cartasJogador = new Cartas[qtdeCartasJogador];
    }

    public Cartas[] getCartasJogador() {
        return cartasJogador;
    }

    public void setCartasJogador(Cartas cartasJogador) {
        for(int i = 0; i < this.cartasJogador.length; i++){
          if(this.cartasJogador[i] == null){
              this.cartasJogador[i] = cartasJogador;
              break;
          }  
        }
    }
    
    public Cartas maiorCarta(){
        for(int i = 0; i < cartasJogador.length; i++){
            if(cartasJogador[i].maiorCartaMao(maiorCarta) == 1){
                maiorCarta = cartasJogador[i];
            } 
        }
        return maiorCarta; 
    }
          
}
