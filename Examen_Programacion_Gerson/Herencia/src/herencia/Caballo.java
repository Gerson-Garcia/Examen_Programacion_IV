/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Hosanna
 */
public class Caballo extends Animal{
    private String razacaballo;

    public Caballo(String nombre, String tipoAlimento, int edad,String razacaballo) {
        super(nombre, tipoAlimento, edad);
        this.razacaballo=razacaballo;
        
    }

    public String getRazacaballo() {
        return razacaballo;
    }

    public void setRazacaballo(String razacaballo) {
        this.razacaballo = razacaballo;
    }

    @Override
    public void mostrardatos() {
       super.mostrardatos(); //To change body of generated methods, choose Tools | Templates.
       System.out.print(" - "+razacaballo);
        System.out.println();
    }
    
    
}
