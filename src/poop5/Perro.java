package poop5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Miguel, Claudio, Cecilia
 */
public class Perro {
    //Attributes
    private String name,
                   raza,
                   color;
    private int edad;

    //Constructors
    public Perro() {
    }
    public Perro(String name, String raza, String color, int edad){
        this.name = name;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }
    
    //Getters
    public String getName(){
        return name;
    }
    public String getRaza(){
        return raza;
    }
    public String getColor(){
        return color;
    }
    public int getEdad(){
        return edad;
    }
    
    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    //Metodos
    public void sentado(){
        System.out.println("Estoy sentado");
    }
    
    public void ladra(int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println("Woaf");
        }
    }
    
    public void corre(int distancia){
        System.out.println("Corri "+distancia+" metros");
    }
    
    public void duerme(int horas){
        System.out.println("Dormi "+horas+" hrs");
    }
    
    //To String
    @Override
    public String toString() {
        return "Perro{" + "name=" + name + ", raza=" + raza + ", color=" + color + ", edad=" + edad + '}';
    }
    
}
