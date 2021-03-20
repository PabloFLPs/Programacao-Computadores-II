/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Documentos.Livro;
import java.util.ArrayList;

/**
 *
 * @author ISTERRA
 */
public final  class Autor extends ManipulaLivros{
    private String nome;
    private String sobreNome;
    

    public Autor(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    } 

    public String getNomeCompleto(){
        return nome+" "+sobreNome;
    }
}
