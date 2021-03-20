/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documentos;
import Dados.Autor;
import Dados.Editora;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
/**
 *
 * @author ISTERRA
 */
public final class Livro extends Documentos{
    private int edicao;
    private int ISBN;
    private String imagePath;
    

    public Livro(String titulo, ArrayList<Autor> autor,  Editora editora,int edicao,double precoAluguel,String Copyright,int ISBN, ImageIcon imagemLivro, String imagePath) {
        super(titulo,autor, editora, precoAluguel,Copyright, imagemLivro);
        this.edicao = edicao;
        this.ISBN = ISBN;
        this.imagePath = imagePath;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }  

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    
    public String retornaAutores(ArrayList<Autor> autores){
        String retorno = "";
        for(Autor o : autores){
            retorno+=o.getNome()+" "+o.getSobreNome()+"\n";
        }
        return retorno;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    
    
    
    
 
    
}
