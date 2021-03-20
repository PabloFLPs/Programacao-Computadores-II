/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;

import java.util.Scanner;

/**
 *
 * @author FELPs
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TrataFormas trataForma = new TrataFormas();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do{
            System.out.println("1-Adicionar forma");
            System.out.println("0-Sair");
            opcao=scanner.nextInt();
            scanner.nextLine();
            if(opcao==1){
                System.out.println("1-Quadrado:");
                trataForma.addFormas(new Quadrado(scanner.nextDouble()));
            }
        }while(opcao!=0);
       trataForma.imprimeFormas();
    }
    
}
