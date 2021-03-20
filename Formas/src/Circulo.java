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
public class Circulo extends FormaBidimensional{
    private double raio;
    private double area;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        area = 2 * Math.PI * raio;
        return area;
    }

    @Override
    public double obterVolume() throws NaoExisteVolumeException {
        throw new NaoExisteVolumeException();
    }
    
    
}
