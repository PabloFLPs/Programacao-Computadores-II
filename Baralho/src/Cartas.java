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
public class Cartas {
    private int valor;
    private String naipe;
    
     public Cartas() {
        this.valor = 0;
        this.naipe = null;
    }


    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public int getValor() {
        return valor;
    }

    public String getNaipe() {
        return naipe;
    }
    
    public int maiorCartaMao(Cartas carta){
        if(this.valor > carta.getValor()){
            return 1;
        }
        if(this.valor < carta.getValor()){
            return 2;
        }
        
        if(this.valor == carta.getValor()){
            if(this.naipe.startsWith("O")){
                return 1;
            }
            else if(carta.getNaipe().startsWith("O")){
                return 2;
            }
            else{
                return 0;
            }
        }
        return 0;
    }

   
    
    
    
}
