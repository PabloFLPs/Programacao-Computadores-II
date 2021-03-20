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
public class Quadrado extends FormaBidimensional{
    private double lado;
    private double area;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        area = lado * lado;
        return area;
    }
    
    @Override
    public double obterVolume() throws NaoExisteVolumeException {
        throw new NaoExisteVolumeException();
    }
}
