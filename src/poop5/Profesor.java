package poop5;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @author Miguel, Claudio, Cecilia
 */
public class Profesor {
    //Attributes
    private String nombre,
                   apellido,
                   materia,
                   division;
    private int edad;
            
    //Constructors
    public Profesor(){
    }
    public Profesor(String nombre, String apellido, String materia, String division, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.division = division;
        this.edad = edad;
    }
    
    //Getters
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getMateria(){
        return materia;
    }
    public String getDivision(){
        return division;
    }
    public int getEdad(){
        return edad;
    }
    
    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setMateria(String materia){
        this.materia = materia;
    }
    public void setDivision(String division){
        this.division = division;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    //Metodos
    public void presentarse(){
        System.out.println("Mi nombre es "+nombre+' '+apellido+
                           " tengo " + edad);
    }
    
    public void materia(){
        System.out.println("Imparto la materia de "+ materia);
    }
    
    public void division(){
        System.out.println("Pertenezco a la "+division);
    }
    
    public void iniciarClase(){
        System.out.println("Sean bienvenidos a la clase");
    }
    
    public void terminarClase(){
        System.out.println("La clase ha terminado");
    }
    
    //To String
    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", apellido=" + apellido + ", materia=" + materia + ", division=" + division + ", edad=" + edad + '}';
    }
    
}
