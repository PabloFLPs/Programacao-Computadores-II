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
public class Terceirizado extends Empregado{
    private int horasTrabalhadas;
    private double valorAPagar;

    public Terceirizado(String nome, String sobrenome, int numIdent, int horasTrabalhadas) {
        super(nome, sobrenome, numIdent);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double getValorAPagar() {
        valorAPagar = horasTrabalhadas * ControlePagamento.hora;
        return valorAPagar;
    }
    
}
