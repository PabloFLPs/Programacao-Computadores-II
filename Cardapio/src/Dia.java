import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Felipe Fernandes Cardozo
 */
public class Dia {
    private Refeicao refeicao[];
    Scanner input=new Scanner(System.in);
    
    public Dia(){
        this.refeicao=new Refeicao[6];
        for(int i=0;i<refeicao.length;i++){
            refeicao[i]=null;
        }
    }
    
    public void setRefeicao(int horaRefeicao, Refeicao comida){
        int opcao;
        if((this.refeicao[horaRefeicao])==null){
            this.refeicao[horaRefeicao] = comida;
        }
        else{
            System.out.println("Ja ha refeicao neste horario, deseja alterar?");
            opcao = input.nextInt();
            if (opcao == 1){
                this.refeicao[horaRefeicao] = comida;
                System.out.println("Refeicao alterada!");
            }
            else{
                System.out.println("Refeicao nao alterada!");
            }
        }
    }
    
    public String getRefeicaoDescricao(int horaRefeicao){
        if(this.refeicao[horaRefeicao]==null){
            return "Nao ha refeicao";
        }
        return this.refeicao[horaRefeicao].getDescricao();
    }
    
    public Double getRefeicaoCaloria(int horaRefeicao){
        if(this.refeicao[horaRefeicao]==null){
            return 0.0;
        }
        return this.refeicao[horaRefeicao].getValorCalorico();
    }
    
    public void excluirRefeicao(int horaRefeicao){
        System.out.println("A refeicao e :" + this.refeicao[horaRefeicao].getDescricao() + ". Deseja apagar?");
        int opcao;
        opcao = input.nextInt();
        if (opcao == 1){
            this.refeicao[horaRefeicao]=null;
            System.out.println("Refeicao apagada!");
        }
        else{
            System.out.println("Refeicao nao apagada!");
        }      
    }
    
    public double calcularCalorias(){
        double valorCalorico = 0;
        for (int i=0;i<refeicao.length;i++){
            if(refeicao[i]==null){
                valorCalorico+=0;
            }            
            else{
                valorCalorico+=refeicao[i].getValorCalorico();
            }
        }
        return valorCalorico;
    } 
}
