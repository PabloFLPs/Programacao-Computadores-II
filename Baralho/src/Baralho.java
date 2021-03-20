/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baralho;

import java.util.Random;

/**
 *
 * @author FELPs
 */
public class Baralho {
    
    private Random aleatorio = new Random();
    
    private Cartas baralho[];
    private int qtdeCartas = 52;
    private String naipes[]={"Ouros","Paus","Copas","Espadas"};
        
    
    public Baralho(){
        baralho = new Cartas[52];
        int controleNaipe = 0;
        
        for(int i = 0; i < 52; i++){
           baralho[i] = new Cartas();       
        } 
        
        for(int i = 0; i < 52; i++){
            baralho[i].setValor((i%13)+1);
            baralho[i].setNaipe(naipes[i/13]);
        }
    }
    
    public void getBaralho() {
       for(int i = 0; i < baralho.length; i++){
        if(baralho[i]!= null){
         System.out.println( baralho[i].getValor());
         System.out.println( baralho[i].getNaipe());
         System.out.println();
        }
       }
     }
    
    public boolean embaralhaCartas(){
        Cartas auxiliar = new Cartas();
        
        int i;
        
        for(i=0;i<53;i++){
            int aleatorio1 = aleatorio.nextInt(52);
            int aleatorio2 = aleatorio.nextInt(52);
            
            auxiliar = baralho[aleatorio1];
            baralho[aleatorio1] = baralho[aleatorio2];
            baralho[aleatorio2] = auxiliar;
        }
        
        if(i == 52){
            return true;
        }
        else{
        return false;
        }
    }
   
    public Cartas distribuiCartas(){
        int aleatoria = aleatorio.nextInt(baralho.length);
        Cartas retorno = new Cartas();
        while(true){
            if(baralho[aleatoria]!= null){
                retorno = baralho[aleatoria];
                baralho[aleatoria]=null;
                break;
            }
            else{
                aleatoria = aleatorio.nextInt(baralho.length);
            }
        }
        return retorno;          
    }
    
}
