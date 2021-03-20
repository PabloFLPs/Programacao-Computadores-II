/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Felipe Fernandes Cardozo
 */
public class Cardapio {
    private Dia dias[];
    
    public Cardapio(Dia[] dias){
        this.dias=new Dia[7];
    }
    
    public void setDia(Dia dias, int dia){
        this.dias[dia]=dias;
    }
    
    public void listarCardapio(int dia){
        for (int i=0;i<6;i++){
            System.out.println("Refeicao numero "+i+" do dia"+dia+" e: "+ this.dias[dia].getRefeicaoDescricao(i));
            System.out.println("Valor calorico: "+this.dias[dia].getRefeicaoCaloria(i));
        }
    }
}
