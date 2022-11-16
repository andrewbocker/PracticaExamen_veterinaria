/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaveterinaria;

/**
 *
 * @author fanta
 */
public class Mascota {
        
    private String nombreMascota;
    private String fechaNacimiento;
    private String razaMascota;
    private String marcaAlimento;
    private String estadoCastracion;
    private String cedulaDueno;
    private String diagnostico;
    private String IDMascota;
    private String IDdoctor;

    // Constructor vacio
    
    public mascota(){
    }
        
    //Constructor de la calse
    public mascota(String nombreMascota, String fechaNacimiento, String razaMascota, String marcaAlimento, String estadoCastracion, String cedulaDueno, String diagnostico, String IDMascota, String IDdoctor) {
        this.nombreMascota = nombreMascota;
        this.fechaNacimiento = fechaNacimiento;
        this.razaMascota = razaMascota;
        this.marcaAlimento = marcaAlimento;
        this.estadoCastracion = estadoCastracion;
        this.cedulaDueno = cedulaDueno;
        this.diagnostico = diagnostico;
        this.IDMascota = IDMascota;
        this.IDdoctor = IDdoctor;
    }
    
    // Metodos get
    public String getNombreMascota() {
        return nombreMascota;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getRazaMascota() {
        return razaMascota;
    }

    public String getMarcaAlimento() {
        return marcaAlimento;
    }

    public String getEstadoCastracion() {
        return estadoCastracion;
    }

    public String getCedulaDueno() {
        return cedulaDueno;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getIDMascota() {
        return IDMascota;
    }

    public String getIDdoctor() {
        return IDdoctor;
    }
    
    //Metodos set
    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setRazaMascota(String razaMascota) {
        this.razaMascota = razaMascota;
    }

    public void setMarcaAlimento(String marcaAlimento) {
        this.marcaAlimento = marcaAlimento;
    }

    public void setEstadoCastracion(String estadoCastracion) {
        this.estadoCastracion = estadoCastracion;
    }

    public void setCedulaDueno(String cedulaDueno) {
        this.cedulaDueno = cedulaDueno;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setIDMascota(String IDMascota) {
        this.IDMascota = IDMascota;
    }

    public void setIDdoctor(String IDdoctor) {
        this.IDdoctor = IDdoctor;
    }
    
}
