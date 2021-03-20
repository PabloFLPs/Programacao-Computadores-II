/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documentos;

import Dados.Autor;
import Dados.Editora;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author ISTERRA
 */
public abstract class Documentos {
    protected String titulo;
    protected ArrayList<Autor> autor;
    protected Editora editora;
    protected double precoAluguel;
    protected String Copyright;
    protected ImageIcon imagem;

    public Documentos(String titulo,ArrayList<Autor>autor, Editora editora,double precoAluguel,String Copyright, ImageIcon imagem) {
        this.autor = new ArrayList();
        this.titulo = titulo;
        this.editora = editora;
        this.autor = autor;
        this.precoAluguel = precoAluguel;
        this.Copyright = Copyright;    
        this.imagem = imagem;
    }

    public double getPrecoAluguel() {
        return precoAluguel;
    }

    public void setPrecoAluguel(double precoAluguel) {
        this.precoAluguel = precoAluguel;
    }

    public String getCopyright() {
        return Copyright;
    }

    public void setCopyright(String Copyright) {
        this.Copyright = Copyright;
    }

    public ImageIcon getImagem() {
        return imagem;
    }

    public void setImagem(ImageIcon imagem) {
        this.imagem = imagem;
    }
        
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

     public void  setAutor(ArrayList<Autor> autor){
       this.autor=autor;
    }
   
    public ArrayList<Autor> getAutores(){
       return this.autor;
    }
   
    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }


 

  



    
    
    
}
