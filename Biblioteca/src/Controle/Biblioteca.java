/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Documentos.*;
import Dados.*;
import Visao.JanelaInicial;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author ISTERRA
 */
public class Biblioteca {
        private ArrayList<Documentos> documentos;
        private ArrayList<ManipulaLivros> dados;
        

    public Biblioteca() {
         documentos = new ArrayList();
         dados = new ArrayList();
         autorAuxiliar = new ArrayList();
    }        
       
    ///////////////////////// LOGICA DE AUTOR //////////////////////////////////
    private ArrayList <Autor> autorAuxiliar;
    
    //Autor auxiliar para adicionar no livro
    public void instanciaAuxiliar(){
        autorAuxiliar = new ArrayList();
        autorAuxiliar.clear();
        System.out.println("RESETOU");
    }
    
    //Envia autor para os dados
    public void addAutor(Autor autor){
        dados.add(autor);
    }
    
   
    //Adiciona um autor no vetor auxiliar
    public void adicionaAutorEmAuxiliar(Autor autor){
        autorAuxiliar.add(autor);
    }
    
    //Retorna os autores dos dados
    public ArrayList<Autor> getAutores(){
        ArrayList<Autor> retorno = new ArrayList();
        for(int i=0;i<dados.size();i++){
           if(dados.get(i) instanceof Autor){
               retorno.add(((Autor)dados.get(i)));
           }
        }
        return retorno;
    }
    
    //Chamar pra criar um autor
    public Autor criaAutor(String nome,String sobrenome){
        Autor autor = new Autor(nome,sobrenome);
        return autor;
    }
    public ArrayList<Autor> getAutorAuxiliar(){
        for(Autor o : autorAuxiliar){
            System.out.println(o.getNome() +" "+ o.getSobreNome());
        }
        return autorAuxiliar;
    }

    //Metodo que retorna um autor pelo seu nome
    public Autor retornaPorNome(String nome){
        for(int i=0;i<dados.size();i++){
            if(dados.get(i)instanceof Autor){
                if(((Autor)dados.get(i)).getNome().equals(nome))
                    return ((Autor)dados.get(i));
            }
        }
        return null;
    }
    ////////////////////////// LOGICA DE LIVRO /////////////////////////////////
    //Cria um livro
    public Livro criaLivro(String titulo,ArrayList<Autor> autor, Editora editora, int edicao,double precoAluguel,String Copyright, int ISBN, ImageIcon imagem, String imagePath){
        Livro livro = new Livro(titulo,autor,editora, edicao,precoAluguel,Copyright,ISBN, imagem, imagePath);
        return livro;
    }
    
    //Adiciona um livro
    public void adicionaLivro(Livro livro){
        documentos.add(livro);
    }

    //Retorna um livro
    public Livro livroPesquisado(String titulo){
        for(int i=0;i<documentos.size();i++){
            if(documentos.get(i) instanceof Livro){
                if(documentos.get(i).getTitulo().equals(titulo))
                    return (Livro)documentos.get(i);
            }
        }
        return null;
    }
        public ArrayList<Livro> getLivro(){
            ArrayList<Livro>retorno = new ArrayList();
        for(int i=0;i<documentos.size();i++){
            if(documentos.get(i) instanceof Livro){
                retorno.add(((Livro)documentos.get(i)));
            }
        }
        return retorno;
    }
   
    ///////////////////////// LOGICA DE EDITORA ////////////////////////////////
    //Envia Editora para os dados
    public void addEditora(Editora editora){
        dados.add(editora);
    }
    
    //Retorna todas as editoras
    public ArrayList<Editora> getEditora(){
        ArrayList<Editora> retorno = new ArrayList();
        for(int i=0;i<dados.size();i++){
           if(dados.get(i) instanceof Editora){
               retorno.add(((Editora)dados.get(i)));
           }
        }
        return retorno;
    }

    //Chamar pra criar uma editora
    public Editora criaEditora(String nome){
        Editora editora = new Editora(nome);
          return editora;
    }

    //Metodo que retorna uma editora pelo seu nome
    public Editora retornaEditoraPorNome(String nome){
        for(int i = 0 ; i < dados.size(); i++){
            if(dados.get(i)instanceof Editora){
                if(((Editora)dados.get(i)).getNome().equals(nome))
                    return ((Editora)dados.get(i));
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        JanelaInicial janelaInicial = new JanelaInicial();
        janelaInicial.setVisible(true);
        janelaInicial.setTitle("Sistema Bíblioteca");      
    }
    
}
