/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Felipe Fernandes Cardozo
 */
public class Relogio {
    private Contador hora;
    private Contador minuto;
    private boolean am_pm;
    
    public Relogio(){
        hora=new Contador();
        hora.setLimite(24);
        minuto=new Contador();
        minuto.setLimite(60);
    }
    
    public boolean atualiza(){
        if(!minuto.incrementar()){
            return tictac();
        }
        return true; 
    }
    
    private boolean tictac(){
        return hora.incrementar();
    }
    
    public String getHorario(){
        if(am_pm){    
            if(hora.getValor()<12){
                if(hora.getValor()==00){
                    return String.format("%02d:%02d a.m.",hora.getValor()+12,minuto.getValor());
                } 
                return String.format("%02d:%02d a.m.",hora.getValor(),minuto.getValor());
            }
            else{
                if(hora.getValor()==12){
                    return String.format("%02d:%02d p.m.",hora.getValor(),minuto.getValor());
                }
                return String.format("%02d:%02d p.m.",hora.getValor()-12,minuto.getValor());
            }
        }
        else{
             return String.format("%02d:%02d",hora.getValor(),minuto.getValor());
        }
        
    }
    
    public Contador getHora() {
        return hora;
    }

    public void setHora(Contador hora) {
        this.hora=hora;
    }

    public Contador getMinuto() {
        return minuto;
    }

    public void setMinuto(Contador minuto) {
        this.minuto=minuto;
    }

    public boolean isAmpm() {
        return am_pm;
    }

    public void setAmpm(boolean am_pm) {
        this.am_pm=am_pm;
    }
    
}
