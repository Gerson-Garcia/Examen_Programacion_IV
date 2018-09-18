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
public class Herencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Informatico Informatico= new Informatico("Gerson","Garcia",19,"Masculino","Hospital","Soltero","Informatico","Amedias");
        Informatico.mostrardatos();
        Ingeniero Ingeniero=new Ingeniero("Jesus","Sarmiento",26,"Masculino","Naranjito","Union de Hecho","Informatico","Bastante","si");
        Ingeniero.mostrardatos();
    
    }
    
}
