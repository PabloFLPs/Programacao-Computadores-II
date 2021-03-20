/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;

import java.util.ArrayList;

/**
 *
 * @author FELPs
 */
public class TrataFormas {
    private ArrayList <Forma> forma;
    
    //Never forgot the constructor!!
    public TrataFormas(){
        forma = new ArrayList();
    }
    
    public void addFormas(Forma forma){
        this.forma.add(forma);
    }
    
    public void imprimeFormas(){
        for(int i = 0; i < forma.size(); i++){
            if(forma.get(i) instanceof FormaBidimensional){
                System.out.println("Forma Bidimensional.");
                /*Questao 1 so tem essa linha nessa estrutura.
                System.out.println("Forma Bidimensional.");
                System.out.println("Area: " + forma.get(i).obterArea());*/
                try{
                    System.out.println("Area: " + forma.get(i).obterArea());
                    System.out.println("Volume: " + forma.get(i).obterVolume());
                }catch(NaoExisteVolumeException e){
                    //"System.err" p printar em vermelho.
                    System.err.println(e.getMessage());
                }
                
            }
            else{
                System.out.println("Forma Tridimensional.");
                /*System.out.println("Area: " + forma.get(i).obterArea());
                //Casting example: float a = (float) 5.0;
                System.out.println("Volume: " + ((FormaTridimensional) forma.get(i)).obterVolume());
                */
                try{
                    System.out.println("Area: " + forma.get(i).obterArea());
                    System.out.println("Volume: " + forma.get(i).obterVolume());
                }catch(NaoExisteVolumeException e){
                    //"System.err" p printar em vermelho.
                    System.err.println(e.getMessage());
                }
            }
        }
    }
}
