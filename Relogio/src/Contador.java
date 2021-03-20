/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Felipe Fernandes Cardozo
 */
public class Contador {
    private int valor=0;
    private int limite;

    public boolean incrementar(){
        valor++;
        if(valor==limite){
            valor=0;
            return false;
        }
        else{
            return true;
        }
    }
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor=valor;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite=limite;
    }
    
}
