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
public class Assalariado extends Empregado{
    private int horasExtras;
    private double valorAPagar;

    public Assalariado(String nome, String sobrenome, int numIdent, int horasExtras) {
        super(nome, sobrenome, numIdent);
        this.horasExtras = horasExtras;
    }

    @Override
    public double getValorAPagar() {
        valorAPagar = ControlePagamento.salario + (horasExtras * ControlePagamento.hora);
        return valorAPagar;
    }
    
}
