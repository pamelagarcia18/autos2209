/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hola.mundo;

/**
 *
 * @author usuario
 */
class Persona {
        private String nombre;
    private int edad;
    String getNombre;
    
    //metodo constructor 
    public Persona() {
    
}
 
//metodo constructor sobrecargado 
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        
    }
    //metodo de uso general 
    public String getNombre() {
        return nombre = nombre;
        
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
        
    }
    
    public int getEdad(int edad) {
        return edad;
        
        
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    
    public void comer(String platillo){
        System.out.println(this.nombre + "Está comiendo " + platillo );
    }
    
        
    }
    

