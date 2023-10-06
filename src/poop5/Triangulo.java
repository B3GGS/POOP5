/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * @author Claudio
 */
public class Triangulo {
    
    private Catetos catetos;
    private double hipotenusa,
                   perimetro,
                   angulo;

    public Triangulo() {
    }
    public Triangulo(Catetos catetos, double hipotenusa, double perimetro, double angulo) {
        this.catetos = catetos;
        this.hipotenusa = hipotenusa;
        this.perimetro = perimetro;
        this.angulo = angulo;
    }

    public Catetos getCatetos() {
        return catetos;
    }
    public void setCatetos(Catetos catetos) {
        this.catetos = catetos;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }
    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getAngulo() {
        return angulo;
    }
    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double calcularArea(Catetos catetos){
        return (catetos.getCatetoAdyacente() * 
                catetos.getCatetoOpuesto()) / 2;
    }
    
    public double calcularHipotenusa(Catetos catetos){
        return Math.sqrt((Math.pow(catetos.getCatetoOpuesto(), 2))
                   +    (Math.pow(catetos.getCatetoAdyacente(), 2)));
    }
    
    public double calcularPerimetro(Catetos catetos){
        return catetos.getCatetoAdyacente() + 
               catetos.getCatetoOpuesto() +
               calcularHipotenusa(catetos);
    }
    
    @Override
    public String toString() {
        return "Triangulo{" + "catetos=" + catetos + ", hipotenusa=" + hipotenusa + ", perimetro=" + perimetro + ", angulo=" + angulo + '}';
    }
   
}
