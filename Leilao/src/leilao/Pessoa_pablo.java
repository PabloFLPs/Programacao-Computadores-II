package leilao;

public class Pessoa_pablo {
    private String nome;
    private String contato;
    
    public Pessoa_pablo(String nome,String contato){
        this.nome=nome;
        this.contato=contato;
    }
    
    public void setNome(String nome) {
        this.nome=nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setContato(String contato) {
        this.contato=contato;
    }
    
    public String getContato() {
        return contato;
    }
}