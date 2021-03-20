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
public class Triangulo extends FormaBidimensional{
    private double ladoBase;
    private double altura;
    private double area;

    public Triangulo(double ladoBase, double altura) {
        this.ladoBase = ladoBase;
        this.altura = altura;
    }

    @Override
    public double obterArea() {
        area = (ladoBase * altura)/2;
        return area;
    }
    
    @Override
    public double obterVolume() throws NaoExisteVolumeException {
        throw new NaoExisteVolumeException();
    }    
    
}
