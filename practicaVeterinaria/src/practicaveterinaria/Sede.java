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
    
        
    public void AgregarMascota() {
        for (int i = 0; i < mascotas.length; i++) {
            if (mascotas[i].getNombreMascota() == null) {
                String Nombre = JOptionPane.showInputDialog("Ingrese el "
                        + "nombre de la mascota:");
                String FechaN = JOptionPane.showInputDialog("Ingrese la "
                        + "fecha de nacimiento de la mascota:");
                String Raza = JOptionPane.showInputDialog("Ingrese la raza:");
                String MarcaAl = JOptionPane.showInputDialog("Ingrese la "
                        + "marca del almento que consume:");
                String Castrado = JOptionPane.showInputDialog("La mascota "
                        + "esta castrada, responda con si o no:");
                String cedDueño = JOptionPane.showInputDialog("Ingrese la "
                        + "cédula del dueño");
                String Diagnostico = JOptionPane.showInputDialog("Ingrese "
                        + "el diagnostico:");
                String ID = JOptionPane.showInputDialog("Ingrese "
                        + "el ID de la mascota:");

                String IDDoc = JOptionPane.showInputDialog("Ingrese el ID "
                        + "del doctor:");
                mascotas[i] = new Mascota(Nombre, FechaN,
                        Raza, MarcaAl, Castrado,
                        cedDueño, Diagnostico, ID,
                        IDDoc);
                
                JOptionPane.showMessageDialog(null, "Mascota "
                        + "guardada con exito :)");
                JOptionPane.showMessageDialog(null, "Nombre de la "
                        + "mascota: " + mascotas[i].getNombreMascota()
                        + "\nFecha de nacimiento: " + mascotas[i].getFechaNacimiento()
                        + "\nRaza: " + mascotas[i].getRazaMascota()
                        + "\nMarca de alimento: " + mascotas[i].getMarcaAlimento()
                        + "\nEstado de castración:" + mascotas[i].getMarcaAlimento()
                        + "\nCedula del Dueño:" + mascotas[i].getCedulaDueno()
                        + "\nDiagnostico:" + mascotas[i].getDiagnostico()
                        + "\nID de la mascota:" + mascotas[i].getIDMascota()
                        + "\nID del Doctor:" + mascotas[i].getIDdoctor());
            }
        }
    }

    public void MostrarMascotasSede() {
        for (int i = 0; i < mascotas.length; i++) {
            JOptionPane.showMessageDialog(null, "Nombre de la "
                    + "mascota: " + mascotas[i].getNombreMascota()
                    + "\nFecha de nacimiento: " + mascotas[i].getFechaNacimiento()
                    + "\nRaza: " + mascotas[i].getRazaMascota()
                    + "\nMarca de alimento: " + mascotas[i].getMarcaAlimento()
                    + "\nEstado de castración:" + mascotas[i].getMarcaAlimento()
                    + "\nCedula del Dueño:" + mascotas[i].getCedulaDueno()
                    + "\nDiagnostico:" + mascotas[i].getDiagnostico()
                    + "\nID de la mascota:" + mascotas[i].getIDMascota()
                    + "\nID del Doctor:" + mascotas[i].getIDdoctor());
        }
    }
        //punto i
   public void AgregarDiagnostico() {
        String ID = JOptionPane.showInputDialog("Ingrese el ID de la "
                + "mascota: ");
        String Diagnostico = JOptionPane.showInputDialog("Ingrese el "
                + "diagnostico de la mascota: ");

        for (int i = 0; i < mascotas.length; i++) {
            if (mascotas[i].getIDMascota() == ID) {
                mascotas[i].setDiagnostico(Diagnostico);
                JOptionPane.showMessageDialog(null, "Nuevo diagnostico "
                        + "registrado" + Diagnostico + "para la mascota " + ID);

            }
        }

    }

}
