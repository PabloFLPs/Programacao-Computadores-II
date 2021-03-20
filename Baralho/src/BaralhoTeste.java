/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baralho;

import java.util.Scanner;

/**
 *
 * @author FELPs
 */
public class BaralhoTeste {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int gameOver = 0;

        Jogador jogador1, jogador2;
        Baralho baralho;
        Cartas vencedora ;
        
        do{  
            
        baralho = new Baralho();
        int win;
        Cartas maior[] = new Cartas[2];

            for(int i=0;i<2;i++){
             maior[i] = new Cartas();
             maior[i] = null;
            }
            
            baralho.embaralhaCartas();
            System.out.println("Numero de cartas a ser distruibidas : ");
            int qtdeDistribuicao = ler.nextInt();

            jogador1 = new Jogador(qtdeDistribuicao);
            jogador2 = new Jogador(qtdeDistribuicao);
               
            for(int i = 0; i < qtdeDistribuicao; i++){
               jogador1.setCartasJogador(baralho.distribuiCartas());
            }
             for(int i=0;i<qtdeDistribuicao;i++){
               jogador2.setCartasJogador(baralho.distribuiCartas());
            }
             
            System.out.println(" *" + qtdeDistribuicao + " cartas foram distribuidas para ambos jogadores.");

            maior[0] = jogador1.maiorCarta();
            maior[1] = jogador2.maiorCarta();

            System.out.println("Jogador 1 | NAIPE : "+ maior[0].getNaipe()+" | VALOR : "+ maior[0].getValor());
            System.out.println("Jogador 2 | NAIPE : "+ maior[1].getNaipe()+" | VALOR : "+ maior[1].getValor());

            win = maior[0].maiorCartaMao(maior[1]);

            if(win == 0){
                System.out.println("EMPATE!");
            }
            else{
                if(win == 1){
                    System.out.println("Jogador 1 VENCE O JOGO");
                    gameOver++;
                }
                else{
                     System.out.println("Jogador 2 VENCE O JOGO");
                    gameOver++;
                }
            }
        }while(gameOver != 1);
    }
}
    
