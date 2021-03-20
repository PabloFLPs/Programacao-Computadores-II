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
public class Teste {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Formato 12h?(s/n)");
        String aux=input.nextLine();
        Relogio relogio=new Relogio();
        if(aux.equalsIgnoreCase("s")){
            relogio.setAmpm(true);
        }
        do{
            String horario=relogio.getHorario();
            System.out.println(horario);
        }while(relogio.atualiza());
    }
}
