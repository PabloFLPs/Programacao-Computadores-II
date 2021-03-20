/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Felipe Fernandes Cardozo
 */
public class Refeicao {
    private String descricao;
    private double valorCalorico;
    
    public Refeicao(String descricao, double valorCalorico){
        this.descricao=descricao;
        this.valorCalorico=valorCalorico;
    }
    
    public double getValorCalorico(){
        return this.valorCalorico;
    }
    
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
}
