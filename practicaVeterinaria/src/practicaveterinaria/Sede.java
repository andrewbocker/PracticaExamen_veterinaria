/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaveterinaria;
import javax.swing.JOptionPane;
/**
 *
 * @author fanta
 */
public class Sede {
    
    private int NumSede;
    private String localizacion;
    
    private Dueño[] dueños;
    private Mascota[] mascotas;
    private Doctor[] doctores;

    public Sede() {
    }

    public Sede(int NumSede, String localizacion, Dueño[] dueños, Mascota[] mascotas, Doctor[] doctores) {
        this.NumSede = NumSede;
        this.localizacion = localizacion;
        this.dueños = new Dueño[10];
        this.mascotas = new Mascota[10];
        this.doctores = new Doctor[10];
    }

    public int getNumSede() {
        return NumSede;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public Dueño[] getDueños() {
        return dueños;
    }

    public Mascota[] getMascotas() {
        return mascotas;
    }

    public Doctor[] getDoctores() {
        return doctores;
    }

    public void setNumSede(int NumSede) {
        this.NumSede = NumSede;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public void setDueños(Dueño[] dueños) {
        this.dueños = dueños;
    }

    public void setMascotas(Mascota[] mascotas) {
        this.mascotas = mascotas;
    }

    public void setDoctores(Doctor[] doctores) {
        this.doctores = doctores;
    }

    public void AgregarDueño() {
        for (int i = 0; i < dueños.length; i++) {
            if (dueños[i].getNombre() == null) {
                String Nombre = JOptionPane.showInputDialog("Ingrese el nombre del dueño:");
                String Apellidos= JOptionPane.showInputDialog("Ingrese los apellidos del dueño:");
                String Cedula = JOptionPane.showInputDialog("Ingrese la cedula del dueño:");
                String NumTelefono = JOptionPane.showInputDialog("Ingrese el telefono del dueño:");    
                dueños[i]= new Dueño(Nombre, Apellidos, Cedula, NumTelefono);
                
                JOptionPane.showMessageDialog(null,"Dueño guardado con exito :)");
                JOptionPane.showMessageDialog(null, "Nombre del dueño: "+dueños[i].getNombre()+
                        "\nApellidos: "+dueños[i].getApellidos()+"\nCedula: "+dueños[i].getCedula()+
                        "\nTelefono: "+dueños[i].getNumeroTelefono());
            }
            
        }
    }
    
    public void MostrarInfoDueño(){
        
        
    }
        

    

}
