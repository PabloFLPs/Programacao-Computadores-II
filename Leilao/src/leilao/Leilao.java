package leilao;

public class Leilao {
    private Lote_pablo[] leilao;
    private String todosLotes="";
    
    public Leilao(Lote_pablo[] leilao,String todosLotes){
        this.leilao=leilao;
        this.todosLotes=todosLotes;
    }
    
    public boolean adicionarLote(Lote_pablo lote){
        for(int i=0;i<leilao.length;i++){
            if(leilao[i]==null){
                leilao[i]=lote;
                return true;
            }
        }
        return false;
    }
    
    public boolean recebeLance(Lance_pablo lance, String descricao){
        for(int i=0;i<leilao.length;i++){
            if(leilao[i].getDescricao().equals(descricao)){
                return true;
            }
        }
        return false;
    }
    
    public String imprimeLotes(){
        for(int i=0;i<leilao.length;i++){ 
            todosLotes=todosLotes+"Descricao do Lote: "+leilao[i].getDescricao()+" Lote vendido por: "+leilao[i].getMaiorLance()+"\n";
        }
        return todosLotes;
    }
    
    public String encerraLeilao(){
        return "Leilao encerrado!";
    }
}