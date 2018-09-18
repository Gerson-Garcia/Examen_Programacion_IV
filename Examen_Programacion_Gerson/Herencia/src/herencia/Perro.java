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
public class Perro extends Animal{
    private String razaperro;

    public Perro(String nombre, String tipoAlimento, int edad,String razaperro) {
        super(nombre, tipoAlimento, edad);
        this.razaperro=razaperro;
        
    }

    @Override
    public void mostrardatos() {
        super.mostrardatos(); //To change body of generated methods, choose Tools | Templates.
        System.out.print(" - "+razaperro);
        System.out.println();
    }
    
    
    
}
