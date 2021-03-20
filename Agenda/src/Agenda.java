/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.ArrayList;

/**
 *
 * @author FELPs
 */
public class Agenda {
    private ArrayList <Contato> agenda;

    public Agenda(ArrayList <Contato> agenda) {
        this.agenda = agenda;
    }
    
     public Agenda() {
        this.agenda = new ArrayList<Contato>();
    }
     
    public void addContato(Contato contato){
        agenda.add(contato);
    }
    
    public int exibirTotal(){
        return agenda.size();
    }
    
    public void exibirContato(String nome){
        for(int i = 0; i < agenda.size(); i++){
            if(agenda.get(i).getNome().equals(nome)){
                System.out.println("Nome: " + agenda.get(i).getNome());
                System.out.println("Email: " + agenda.get(i).getEmail());
                System.out.println("Telefone: " + agenda.get(i).getTelefone());
            }
        }
    }
    
    public void excluirContato(String nome){
        for(int i = 0; i < agenda.size(); i++){
            if(agenda.get(i).getNome().equals(nome)){
                agenda.remove(agenda.get(i));
            }
        }
    }
               
    public void exibirTodos(){
        System.out.println("Contatos: ");
        for(int i = 0; i < agenda.size(); i++){
                System.out.println("Nome: " + agenda.get(i).getNome());
                System.out.println("Email: " + agenda.get(i).getEmail());
                System.out.println("Telefone: " + agenda.get(i).getTelefone());
                System.out.println("");
        }
    } 
    
}
