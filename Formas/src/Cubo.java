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
public class Cubo extends FormaTridimensional{
    private double lado;
    private double area;
    private double volume;

    public Cubo(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double obterVolume() {
        this.volume = obterArea() * lado;
        return volume;
    }

    @Override
    public double obterArea() {
        this.area = lado * lado;
        return area;
    }
    
}
