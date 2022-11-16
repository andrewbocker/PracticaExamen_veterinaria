/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaveterinaria;

/**
 *
 * @author fanta
 */
public class Doctor {
    //Atributos
    private String nombre;
    private String apellidos;
    private String cedula;
    private String IDdoctor;
    private String numeroSede;

    //Constructor vacio 
    public Doctor() {

    }
    
    //Constructor
    public Doctor(String nombre, String apellidos, String cedula, String IDdoctor, String numeroSede) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.IDdoctor = IDdoctor;
        this.numeroSede = numeroSede;
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public String getIDdoctor() {
        return IDdoctor;
    }

    public String getNumeroSede() {
        return numeroSede;
    }

    //SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setIDdoctor(String IDdoctor) {
        this.IDdoctor = IDdoctor;
    }

    public void setNumeroSede(String numeroSede) {
        this.numeroSede = numeroSede;
    }

}
