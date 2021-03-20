/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagamento;

/**
 *
 * @author FELPs
 */
public class Titulo extends Conta{
    private int diaAtual;
    private int mesAtual;
    private double valorAPagar;

    public Titulo(int dia, int mes, int diaAtual, int mesAtual, double valor) {
        super(dia, mes, valor);
        this.diaAtual = diaAtual;
        this.mesAtual = mesAtual;
    }

    @Override
    public double getValorAPagar() {
        if(mes >= mesAtual){
            if(dia < diaAtual && mes == mesAtual){
                valorAPagar = (valor * 0.1) + valor;
            }
            else if(dia > diaAtual && mes == mesAtual){
                valorAPagar = valor;
            }
        }
        else if(mes < mesAtual){
            valorAPagar = valor;
        }
        return valorAPagar;
    }
    
}
