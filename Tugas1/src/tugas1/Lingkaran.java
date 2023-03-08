/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author dell
 */
public class Lingkaran implements MenghitungBidang{
    float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    @Override
    public double luas() {
        return Math.PI*r*r;
    }

    @Override
    public double keliling() {
        return Math.PI*2*r;
    }
}
