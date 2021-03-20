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
public class Editora extends ManipulaLivros{
    private String nome;

    public Editora(String nome) {
        this.nome = nome;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
}
