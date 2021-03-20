/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Felipe Fernandes Cardozo
 */
public class Enquete {
    private int[] notas;
    private int[] frequencia=new int[10];
   
    public int getFrequencia(int posicaoNota){
        return frequencia[posicaoNota];
    }
    public double getMedia(){
        double media=0.0;
        for(int i=0;i<notas.length;i++){
            media+=notas[i];
        }
        media=media/getNumClientes();
        return media;
    }
    public int getNumClientes(){
        return notas.length;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas=notas;
        for(int i=0;i<notas.length;i++){
            for(int j=0;j<notas.length;j++){
                if((i+1)==notas[j]){
                    frequencia[i]++;
                }
            }
        }
    }
}
