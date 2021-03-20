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
public class Comissionado extends Empregado{
    protected double vendas;
    private double valorAPagar;

    public Comissionado(String nome, String sobrenome, int numIdent, double vendas) {
        super(nome, sobrenome, numIdent);
        this.vendas = vendas;
    }

    @Override
    public double getValorAPagar() {
        valorAPagar = vendas * 0.6;
        return valorAPagar;
    }
    
}
