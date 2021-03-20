/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagamento;

import java.util.ArrayList;

/**
 *
 * @author FELPs
 */
public class ControlePagamento {
    public static double salario = 954.00;
    public static double hora = 8.00;
    private double[] valorTotal = new double[2];
    
    public ArrayList <Pagavel> pagavel;
    
    public ControlePagamento(){
        pagavel = new ArrayList();
    }    
    
    public void addPagavel(Pagavel pagavel){
        this.pagavel.add(pagavel);
    }
    
    public double[] valorTotalAPagar(){
        valorTotal[0] = 0;
        valorTotal[1] = 0;
        for(int i = 0; i < pagavel.size(); i++){
            //Funcionarios;
            if(pagavel.get(i) instanceof Conta){
                valorTotal[0] += pagavel.get(i).getValorAPagar();
            }
            //Contas;
            else if(pagavel.get(i) instanceof Empregado){
                valorTotal[1] += pagavel.get(i).getValorAPagar();
            }
        }
        return valorTotal;
    }
    
}
