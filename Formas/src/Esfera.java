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
public class Esfera extends FormaTridimensional{
    private double raio;
    private double area;
    private double volume;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public double obterVolume() {
        volume = (4/3) * Math.PI * (raio * raio * raio);
        return volume;
    }

    @Override
    public double obterArea() {
        area = 4 * Math.PI * (raio * raio);
        return area;
    }
    
}
