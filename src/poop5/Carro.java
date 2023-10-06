/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * @author Miguel, Claudio, Cecilia
 */
public class Carro {
    
    //Attributes
    private String marca,
                   modelo,
                   color;
    private boolean combustible;
    
    //Constructors
    public Carro(){
    }
    public Carro(String marca, String modelo, String color, boolean combustible){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.combustible = combustible;
    }
    
    //Getters
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
    }
    public boolean isCombustible(){
        return combustible;
    }
    
    //Setter
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setCombustible(boolean combustible){
        this.combustible = combustible;
    }
    
    //Metodos
    public void avanzar(){
        if (combustible){
            System.out.println("El coche avanzo");
        }
        else{
            System.out.println("No hay combustible");
        }    
    }
    
    public void retroceder(){
        if (combustible){
            System.out.println("El coche retrocedio");
        }
        else{
            System.out.println("No hay combustible");
        } 
    }
    
    public void prender(){
        System.out.println("Auto encendido");
    }
    
    public void apagar(){
        System.out.println("Auto apagado");
    }
    
    public void girar(String lado){
        System.out.println("El coche gira a la "+lado);
    }
    
    public String pemex(boolean valor){
        if (valor){
            return "Tanque lleno";
        }
        else{
            return "Tanque vacío";
        }
    }
   
    //To String
    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", combustible=" + combustible + '}';
    }
    
}
