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
public class Ingeniero extends Personas{
    private String razonar;
    private String trabajargrupo;

    public Ingeniero(String nombre, String apellido, int edad, String sexo, String lugarnacimiento, String Ssentimental, String profesion,String razonar,String trabajargrupo) {
        super(nombre, apellido, edad, sexo, lugarnacimiento, Ssentimental, profesion);
        this.razonar=razonar;
        this.trabajargrupo=trabajargrupo;
    }

  

    public String getRazonar() {
        return razonar;
    }

    public void setRazonar(String razonar) {
        this.razonar = razonar;
    }

    public String getTrabajargrupo() {
        return trabajargrupo;
    }

    public void setTrabajargrupo(String trabajargrupo) {
        this.trabajargrupo = trabajargrupo;
    }

    @Override
    public void mostrardatos() {
        super.mostrardatos(); //To change body of generated methods, choose Tools | Templates.
         System.out.print(" - "+razonar+ " - " + trabajargrupo);
          System.out.println();
    }
    
    
    
}
