package poop5;
/**
 * @author Miguel, Claudio, Cecilia
 */
public class Alumno {
    //Private Attributes
    private String name, //Nombre
                   lastName, //Apellido
                   career; //Carrera
    private int stdId; //No. Identificacion
    private double average; //Promedio

    //Constructors
    public Alumno(){
    }
    public Alumno(String name, String lastName, String career, int stdId, double average){
        this.name = name;
        this.lastName = lastName;
        this.career = career;
        this.stdId = stdId;
        this.average = average;
    }
    
    //Getters
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public String getCareer(){
        return career;
    }
    public int getStdId(){
        return stdId;
    }
    public double getAverage(){
        return average;
    }
    
    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setCareer(String career){
        this.career = career;
    }
    public void setStdId(int stdId){
        this.stdId = stdId;
    }
    public void setAverage(double average){
        this.average = average;
    }
    
    //Methods
    public void presentation(){
        System.out.print("I am "+name+' '+lastName+'\n');
    }
    /**
     * @return "Presente": Representa la asistencia del alumno. 
     */
    public String attendance(){ 
        return "Hello";
    }
    
    public String scolarship(){
        if (average >= 8.5){
            return "Scolarship Candidate";
        }
        else{
            return "Invalid requirements";
        }
    }
    
    public boolean estudiar(){
        return true;
    }
    public void examen(){
        if (estudiar()){
            System.out.println("Examen Aprobado");
        }
        else{
            System.out.println("Examen Reprobado");
        }
    }
    
    //To String
    @Override
    public String toString() {
        return "Alumno{" + "name=" + name + 
                ", lastName=" + lastName + 
                ", career=" + career + 
                ", stdId=" + stdId + 
                ", average=" + average + '}';
    }
    
}