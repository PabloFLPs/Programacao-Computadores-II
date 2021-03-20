package leilao;
import java.util.Scanner;

public class TesteLeilao_pablo {
    public static void main(String[] args){
        Scanner ler=new Scanner (System.in);
        Pessoa_pablo pessoa;
        String nome;
        String contato;
        double valor;
        Lance_pablo lance;
        //Lote_pablo[] lote;
        
        Lote_pablo[] leilao=new Lote_pablo[10];
        
        for(int i=0;i<10;i++){
            leilao[i].setDescricao(ler.next());
            leilao[i].setMaiorLance(new Lance_pablo(new Pessoa_pablo(ler.next(),ler.next()),ler.nextDouble()));
        }
    }
}