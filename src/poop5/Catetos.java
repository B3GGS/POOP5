/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;
/**
 * @author Miguel, Claudio, Cecilia
 */
public class Catetos {
    private double catetoOpuesto,
                   catetoAdyacente;

    public Catetos() {
    }
    public Catetos(double catetoOpuesto, double catetoAdyacente) {
        this.catetoOpuesto = catetoOpuesto;
        this.catetoAdyacente = catetoAdyacente;
    }

    public double getCatetoOpuesto() {
        return catetoOpuesto;
    }
    public void setCatetoOpuesto(double catetoOpuesto) {
        this.catetoOpuesto = catetoOpuesto;
    }

    public double getCatetoAdyacente() {
        return catetoAdyacente;
    }
    public void setCatetoAdyacente(double catetoAdyacente) {
        this.catetoAdyacente = catetoAdyacente;
    }

    @Override
    public String toString() {
        return "Catetos{" + "catetoOpuesto=" + catetoOpuesto + ", catetoAdyacente=" + catetoAdyacente + '}';
    }
}
