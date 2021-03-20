/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.security.SecureRandom;
import java.util.Scanner;
/**
 *
 * @author Pablo Felipe Fernandes Cardozo
 */
public class TesteEnquete {
    public static void main(String[] args){
        int numeroEntrevistados;
        
        Scanner input=new Scanner(System.in);
        System.out.println("Digite o numero de entrevistados na Enquete: ");
        numeroEntrevistados=input.nextInt();
        
        Enquete enquete=new Enquete();
        int notas[]=new int[numeroEntrevistados];
        
        SecureRandom gerador=new SecureRandom();
        for(int i=0;i<numeroEntrevistados;i++){
           notas[i]=(gerador.nextInt(10)+1); 
           System.out.printf("\nA nota aluno de numero "+i+" foi: "+notas[i]);
        }
        
        enquete.setNotas(notas);
        System.out.printf("\n\n%d alunos foram entrevistados%n",enquete.getNumClientes());
        System.out.printf("\nA media de notas foi: "+enquete.getMedia());
        for(int i=0;i<notas.length;i++){
            System.out.printf("\nA frequencia da nota "+(i+1)+" foi: "+enquete.getFrequencia(i));
        }
    }
    
}
