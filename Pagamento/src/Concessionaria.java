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
public class Concessionaria extends Conta{
    private double valorAPagar;

    public Concessionaria(int dia, int mes, double valor) {
        super(dia, mes, valor);
    }

    @Override
    public double getValorAPagar() {
        valorAPagar = valor;
        return valorAPagar;
    }
    
}
