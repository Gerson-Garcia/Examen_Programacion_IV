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
public class Animal {
    private String nombre;
    private String tipoAlimento;
    private int edad;

    public Animal(String nombre, String tipoAlimento, int edad) {
        this.nombre = nombre;
        this.tipoAlimento = tipoAlimento;
        this.edad = edad;
    }

  
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
  public void mostrardatos(){
  System.out.print(nombre +" - "+ tipoAlimento+ " - "+edad);
  }
      
    
   
}
