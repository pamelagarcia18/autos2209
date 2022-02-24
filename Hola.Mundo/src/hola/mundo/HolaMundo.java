/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola.mundo;

import java.awt.Color;

/**
 *
 * @author usuario
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo!!!");
        Persona per1 = new Persona();
        per1.setNombre("Pam GS ");
        System.out.println( "Nombre: " + per1.getNombre() );   
        per1.comer("Tacos de pastor");
        
        
        Persona per2 = new Persona();
        per2.setNombre("Mario A. ");
        System.out.println("Nombre:" + per2.getNombre() );
        per2.comer("Pizza hawaiana");
        
        Automovil bocho=new Automovil();
        System.out.println("El automivil es un: Bocho ");
        bocho.setMarca("VM");
        System.out.println("Marca: " + bocho.getMarca() );
         bocho.setSubMarca("Sedan");
        System.out.println("SubMarca: " + bocho.getSubMarca() );
        bocho.setModelo(1970); 
        System.out.println("Modelo: " + bocho.getModelo() );

        bocho.setColor(Color.BLUE);
        System.out.println("Color: " + bocho.getColor() );
        
        Automovil mustang=new Automovil();
        System.out.println("El automóvil es un: Mustang");
        mustang.setMarca("Ford");
        System.out.println("Marca: " + mustang.getMarca() );
        mustang.setSubMarca("Mustan");
        System.out.println("SubMarca: " + bocho.getSubMarca() );
        mustang.setModelo(2010);
        System.out.println("Modelo: " + mustang.getModelo() );
        mustang.setColor(Color.yellow);
        System.out.println("Color: " + mustang.getColor() );
        
         Automovil akura=new Automovil();
        System.out.println("El automóvil es un: Akura");
        akura.setMarca("Akura");
        System.out.println("Marca: " + akura.getMarca() );
        akura.setSubMarca("NSX");
        System.out.println("SubMarca: " + akura.getSubMarca() );
        akura.setModelo(2013);
        System.out.println("Modelo: "+ akura.getModelo() );
        akura.setColor(Color.gray);
        System.out.println("Color: " + akura.getColor() );
        
        
        
        
        
        
        
            
      
        
    }
    
}
