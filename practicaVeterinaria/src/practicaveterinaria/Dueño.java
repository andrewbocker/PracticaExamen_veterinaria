/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaveterinaria;

/**
 *
 * @author fanta
 */
public class Dueño {
    
    private String nombre;
    private String apellidos;
    private String cedula;
    private String numerotelefono;
    
    public Dueño() {
    }

    public Dueño(String nombre, String apellidos, String cedula, 
            String numerotelefono){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.numerotelefono = numerotelefono;
        
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public String getCedula(){
        return cedula;
    }
    public String getNumeroTelefono(){
        return numerotelefono;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
    public void setNumeroTelefono(String numerotelefono){
        this.numerotelefono = numerotelefono;
    }
    
}
