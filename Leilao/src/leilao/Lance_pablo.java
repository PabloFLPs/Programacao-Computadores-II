package leilao;

public class Lance_pablo {
    private Pessoa_pablo pessoa;
    private double valor;
    
    public Lance_pablo(Pessoa_pablo pessoa,double valor){
        this.pessoa=pessoa;
        this.valor=valor;
    }
    
    public void setPessoa(Pessoa_pablo pessoa){
        this.pessoa=pessoa;
    }
    
    public Pessoa_pablo getPessoa(){
        return pessoa;
    }
    
    public void setValor(double valor){
        this.valor=valor;
    }
    
    public double getValor(){
        return valor;
    }
    
    public Lance_pablo verificaMaior(Lance_pablo lance){
        if(this.valor>lance.getValor()){
            return this;
        }
        else{
            return lance;
        }
    }
}