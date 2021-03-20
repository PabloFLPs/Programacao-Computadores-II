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
public class AssalariadoComissionado extends Comissionado{
    private double valorAPagar;
    
    public AssalariadoComissionado(String nome, String sobrenome, int numIdent, double vendas) {
        super(nome, sobrenome, numIdent, vendas);
    }
    
    @Override
    public double getValorAPagar() {
        valorAPagar = ControlePagamento.salario + (vendas * 0.6);
        return valorAPagar;
    }
    
}
