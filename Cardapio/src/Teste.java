/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Felipe Fernandes Cardozo
 */
public class Teste {
    public static void main(String[] args) {      
        Dia[] dias=new Dia[7];
        
        Refeicao refeicao[]=new Refeicao[6];
        
        
        Cardapio cardapio=new Cardapio(dias);
        
        cardapio.setDia(dias[0], 1);
        cardapio.setDia(dias[1], 2);
        cardapio.setDia(dias[2], 3);
        cardapio.setDia(dias[3], 4);
        cardapio.setDia(dias[4], 5);
        cardapio.setDia(dias[5], 6);
        cardapio.setDia(dias[6], 7);
        
        for(int i=0;i<5;i++){
            dias[i].setRefeicao(i, refeicao[i]);
        }
        
        cardapio.listarCardapio(0);
        
        for(int i=0;i<5;i++){
            dias[i].excluirRefeicao(i);
        }
        
        cardapio.listarCardapio(0);
        
        for(int i=0;i<5;i++){
            System.out.println(dias[i].calcularCalorias()); 
        }
    }
}
