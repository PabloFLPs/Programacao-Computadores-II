/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagamento;

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
        ControlePagamento controlePagamento = new ControlePagamento();
        Scanner scanner = new Scanner(System.in);
        double[] valorTotal = new double[2];
        int aux;
        
        do{
            System.out.println("0-Sair ");
            System.out.println("1-Cadastrar Funcionario: ");
            System.out.println("2-Adicionar Conta a ser paga: ");
            System.out.println("11-Mostrar relacao de valores a serem pagos para funcionarios: ");
            System.out.println("22-Mostrar relacao de valores a serem pagos a contas: ");
            System.out.println("33-Mostrar relacao total de valores a serem pagos no mes: ");
            aux = scanner.nextInt();
            scanner.nextLine();
            valorTotal = controlePagamento.valorTotalAPagar();
            switch (scanner.nextInt()) {
                case 1: 
                    System.out.println("Qual tipo de funcionario voce deseja cadastrar?");
                    System.out.println("1-Assalariado");
                    System.out.println("2-Terceirizado");
                    System.out.println("3-Comissionado");
                    System.out.println("4-Assalariado e Comissionado");
                    switch (scanner.nextInt()) {
                        case 1: 
                            System.out.println("1-Assalariado -> Nome, Sobrenome, ID, Horas Extras:"); 
                            controlePagamento.addPagavel(new Assalariado(scanner.next(),scanner.next(),scanner.nextInt(),scanner.nextInt())); break;
                        case 2: 
                            System.out.println("2-Terceirizado -> Nome, Sobrenome, ID, Horas Trabalhadas:"); 
                            controlePagamento.addPagavel(new Terceirizado(scanner.next(),scanner.next(),scanner.nextInt(),scanner.nextInt())); break;
                        case 3: 
                            System.out.println("3-Comissionado -> Nome, Sobrenome, ID, Vendas:"); 
                            controlePagamento.addPagavel(new Comissionado(scanner.next(),scanner.next(),scanner.nextInt(),scanner.nextDouble())); break;
                        case 4: 
                            System.out.println("4-Assalariado e Comissionado -> Nome, Sobrenome, ID, Vendas:"); 
                            controlePagamento.addPagavel(new AssalariadoComissionado(scanner.next(),scanner.next(),scanner.nextInt(),scanner.nextDouble())); break;
                    } break;
                case 2:
                    System.out.println("Qual tipo de conta voce deseja cadastrar?");
                    System.out.println("1-Titulo");
                    System.out.println("2-Contas de Concessionarias");
                    switch (scanner.nextInt()) {
                        case 1: 
                            System.out.println("1-Titulo -> Dia, Mes, Dia Atual, Mes Atual, Valor da Conta:"); 
                            controlePagamento.addPagavel(new Titulo(scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(), scanner.nextDouble())); break;
                        case 2: 
                            System.out.println("2-Concessionaria -> Dia, Mes, Valor da Conta:"); 
                            controlePagamento.addPagavel(new Concessionaria(scanner.nextInt(),scanner.nextInt(),scanner.nextDouble())); break;
                    } break;
                case 11: System.out.println("Funcionarios: " + valorTotal[0]); break;
                case 22: System.out.println("Contas: " + valorTotal[1]); break;
                case 33: System.out.println("Total: " + (valorTotal[0]) + valorTotal[1]); break;
            }
        }while(aux != 0);
    }
    
}
