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
public class Tetraedro extends FormaTridimensional{
    private double ladoTriangulo;
    private double volume;
    private double area;

    public Tetraedro(double ladoTriangulo) {
        this.ladoTriangulo = ladoTriangulo;
    }

    @Override
    public double obterVolume() {
        volume = ((ladoTriangulo * ladoTriangulo * ladoTriangulo) * Math.sqrt(2))/12;
        return volume;
    }

    @Override
    public double obterArea() {
        area = (ladoTriangulo * ladoTriangulo) * Math.sqrt(3);
        return area;
    }
}
