/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author dell
 */
public class Tabung extends Lingkaran implements MenghitungRuang{
        float t;

    public Tabung(float t, float r) {
        super(r);
        this.t = t;
    }
 
    public Tabung(int t, int r) {
        super(r);
        this.t = t; 
    }

    @Override
    public double volume() {
        return this.luas()*t;
    }

    @Override
    public double luasPermukaan() {
        return this.keliling()*(r+t);
    }
        
}
