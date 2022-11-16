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
    private String IDdueno;
    
    public Dueño(String nombre, String apellidos, String cedula, 
            String numerotelefono, String IDdueno){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.numerotelefono = numerotelefono;
        this.IDdueno = IDdueno;
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
    public String getID(){
        return IDdueno;
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
    public void setID(String IDdueno){
        this.IDdueno = IDdueno;
    }
    
}
