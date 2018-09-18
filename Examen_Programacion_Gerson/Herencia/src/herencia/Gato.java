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
public class Gato extends Animal{
    private String razagato;

    public Gato(String nombre, String tipoAlimento, int edad,String razagato) {
        super(nombre, tipoAlimento, edad);
        this.razagato=razagato;
        
    }

    public String getRazagato() {
        return razagato;
    }

    public void setRazagato(String razagato) {
        this.razagato = razagato;
    }
    

    @Override
    public void mostrardatos() {
        super.mostrardatos(); //To change body of generated methods, choose Tools | Templates.
        System.out.print(" - "+razagato);
        System.out.println();
        
    }
    
}
