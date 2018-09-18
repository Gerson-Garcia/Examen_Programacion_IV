/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

/**
 *
 * @author Hosanna
 */
public class Personas {
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private String lugarnacimiento;
    private String Ssentimental;
    private String profesion;

    public Personas(String nombre, String apellido, int edad, String sexo, String lugarnacimiento, String Ssentimental, String profesion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.lugarnacimiento = lugarnacimiento;
        this.Ssentimental = Ssentimental;
        this.profesion = profesion;
    }

  
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLugarnacimiento() {
        return lugarnacimiento;
    }

    public void setLugarnacimiento(String lugarnacimiento) {
        this.lugarnacimiento = lugarnacimiento;
    }

    public String getSsentimental() {
        return Ssentimental;
    }

    public void setSsentimental(String Ssentimental) {
        this.Ssentimental = Ssentimental;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
   public void mostrardatos(){
       System.out.print(nombre + " - " + apellido + " - " + edad + " - " + lugarnacimiento + " - "+Ssentimental+ " - " + profesion );
   }
   
    
    
    
}
