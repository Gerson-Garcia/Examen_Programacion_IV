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
public class Informatico extends Personas{
    private String crearprogramas;

    public Informatico(String nombre, String apellido, int edad, String sexo, String lugarnacimiento, String Ssentimental, String profesion,String crearprogramas) {
        super(nombre, apellido, edad, sexo, lugarnacimiento, Ssentimental, profesion);
        this.crearprogramas=crearprogramas;
        
    }

    
    
    
    

    public String getCrearprogramas() {
        return crearprogramas;
    }

    public void setCrearprogramas(String crearprogramas) {
        this.crearprogramas = crearprogramas;
    }

    @Override
    public void mostrardatos() {
        super.mostrardatos(); //To change body of generated methods, choose Tools | Templates.
        System.out.print(" - " + crearprogramas);
        System.out.println();
    }
    
    
    
}
