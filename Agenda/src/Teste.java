/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.Scanner;

/**
 *
 * @author FELPs
 */
public class Teste {
    public static void main(String[] args) {
        Scanner = new Scanner(System.in);
        int aux;
        
        String nome = null;
        String email = null;
        String telefone = null;
        
        int total = 0;

        System.out.println("1 - Insere novo contato na agenda: ");
        System.out.println("2 - Exibe o número total de contatos da agenda: ");
        System.out.println("3 - Exibe um contato: ");
        System.out.println("4 - Exclui um contato: ");
        System.out.println("5 - Exibe todos os contatos da agenda: ");
        System.out.println("0 - Sair"); 
        
        System.out.print("Digite opcao :");         
        aux = scanner.nextInt();
        
        Agenda agenda = new Agenda();
        
        do{
            if(aux == 1){
                scanner.nextLine();
                System.out.println("Digite Nome: ");
                nome = scanner.nextLine();
                System.out.println("Digite Email: ");
                email = scanner.nextLine();
                System.out.println("Digite Telefone: ");
                telefone = scanner.nextLine();   
                Contato contato = new Contato(nome, email, telefone);
                agenda.addContato(contato);
            }
            
            if(aux == 2){
                total = agenda.exibirTotal();
                System.out.println("Num. total de pessoas cadastradas : "+total);
            }
            
            if(aux == 3){
                ler.nextLine();
                System.out.println("Digite nome : ");
                nome = scanner.nextLine();   
                agenda.exibirContato(nome);                
            }
            
            if(aux == 4){
                ler.nextLine();
                System.out.println("Digite nome : ");
                nome = scanner.nextLine();   
                agenda.excluirContato(nome);                 
            }
            
            if(aux == 5){
                agenda.exibirTodos();
            }
        System.out.print("Digite opcao :");     
        op = scanner.nextInt(); 
        }while(op != 0);
    }


}
