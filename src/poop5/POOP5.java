/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;
/**
 * @author Miguel, Claudio, Cecilia
 */
public class POOP5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    /* CLASS ALUMNO */
        //Insertar Datos
        Alumno alumno = new Alumno();
        alumno.setName("Nombre");
        alumno.setLastName("Apellido");
        alumno.setCareer("Engineer");
        alumno.setAverage(9.1);
        alumno.setStdId(12345);
        //Mostrar Datos
        System.out.println(alumno.toString());
        //Metodos 
        System.out.println(alumno.attendance());
        alumno.presentation();
        alumno.examen();
        System.out.println(alumno.scolarship());
        
    /* CLASS - TRIANGULO */
        System.out.println("\n");
        //Insertar Datos
        Triangulo triangulo = new Triangulo();
        Catetos lados = new Catetos(3,4);
        triangulo.setCatetos(lados);
        triangulo.setAngulo((Math.PI/6));
        triangulo.setPerimetro(triangulo.calcularPerimetro
                              (lados));
        triangulo.setHipotenusa(triangulo.calcularHipotenusa
                               (lados));
        //Mostrar Datos
        System.out.println(triangulo.toString());
        //Metodos
        System.out.println("Perimetro: " + triangulo.getPerimetro());
        System.out.println("Area: " + triangulo.calcularArea(lados));
        System.out.println("Hipotenusa: " + triangulo.getHipotenusa());
    
    /* CLASS - PERRO */
        System.out.println("\n");
        //Insertar Datos
        Perro perro = new Perro();
        perro.setName("Firulais");
        perro.setRaza("Callejero");
        perro.setColor("Cafe");
        perro.setEdad(5);
        //Mostrar Datos
        System.out.println(perro.toString());
        //Metodos
        perro.corre(20);
        perro.duerme(5);
        perro.sentado();
        perro.ladra(1);
        
    /* CLASS - PROFESOR */    
        System.out.println("\n");
        //Insertar Datos
        Profesor docente = new Profesor();
        docente.setNombre("Nombre");
        docente.setApellido("Apellido");
        docente.setDivision("DIE");
        docente.setEdad(26);
        docente.setMateria("Programacion");
        //Mostrar Datos
        System.out.println(docente.toString());
        //Metodos
        docente.iniciarClase();
        docente.presentarse();
        docente.division();
        docente.materia();
        docente.terminarClase();
    
    /* CLASS - CARRO */
        System.out.println("\n");
        //Insertar Datos
        Carro carro = new Carro();
        carro.setMarca("Nissan");
        carro.setModelo("Tsuru");
        carro.setColor("Blanco");
        carro.setCombustible(true);
        //Mostrar Datos
        System.out.println(carro.toString());
        //Metodos
        System.out.println(carro.pemex(true));
        carro.prender();
        carro.avanzar();
        carro.girar("derecha");
        carro.retroceder();
        carro.apagar();
    }
}