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
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro Perro =new Perro ("Teddy","Croquetas",10,"Chihuahua");
        Gato Gato =new Gato ("Pelusa","Especial",8,"Siames");
        Caballo Caballo =new Caballo ("Jhonny","Pasto",21,"fino");
        
        
        
        Perro.mostrardatos();
        System.out.println("---------------------------------------------");
        Gato.mostrardatos();
        System.out.println("---------------------------------------------");
        Caballo.mostrardatos();
       
        
    }
    
}
