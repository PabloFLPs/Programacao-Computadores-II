package leilao;

public class Lote_pablo {
    private String descricao;
    private Lance_pablo maiorLance;
    
    public Lote_pablo(String descricao,Lance_pablo maiorLance){
        this.descricao=descricao;
        this.maiorLance=maiorLance;
    }
    
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    
    public void setMaiorLance(Lance_pablo maiorLance){
        this.maiorLance=maiorLance;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public String getMaiorLance(){
        return descricao;
    }
    
    public void verificaLance(Lance_pablo lance){
        maiorLance.verificaMaior(lance);
    }
}