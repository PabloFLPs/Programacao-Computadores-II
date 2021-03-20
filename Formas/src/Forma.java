/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;

/**
 *
 * @author FELPs
 */
public abstract class Forma {
    public abstract double obterArea();
    /*Questao 1 so possui a seguinte linha: 
    public abstract double obterArea();*/
    public abstract double obterVolume() throws NaoExisteVolumeException;
}
