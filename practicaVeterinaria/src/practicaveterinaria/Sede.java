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

    private String NumSede;
    private String localizacion;

    private Dueño[] dueños;
    private Mascota[] mascotas;
    private Doctor[] doctores;

    public Sede() {
    }

    public Sede(String NumSede, String localizacion, Dueño[] dueños,
            Mascota[] mascotas, Doctor[] doctores) {
        this.NumSede = NumSede;
        this.localizacion = localizacion;
        this.dueños = new Dueño[10];
        this.mascotas = new Mascota[10];
        this.doctores = new Doctor[10];
    }

    public String getNumSede() {
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

    public void setNumSede(String NumSede) {
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
        //Verifica si el arreglo de dueños esta inicializado
        for (int i = 0; i < dueños.length; i++) {
            if (dueños[i] == null) {
                Func.inicializarArregloDueños(dueños, i);
            }
        }

        //Guarda la informacion del dueño
        for (int i = 0; i < dueños.length; i++) {
            if (dueños[i].getNombre() == null) {
                String Nombre = JOptionPane.showInputDialog("Ingrese el "
                        + "nombre del dueño:");
                String Apellidos = JOptionPane.showInputDialog("Ingrese "
                        + "los apellidos del dueño:");
                String Cedula = JOptionPane.showInputDialog("Ingrese la "
                        + "cedula del dueño:");
                String NumTelefono = JOptionPane.showInputDialog("Ingrese "
                        + "el telefono del dueño:");

                dueños[i] = new Dueño(Nombre, Apellidos, 
                        Cedula, NumTelefono);

                JOptionPane.showMessageDialog(null, "Dueño"
                        + "guardado con exito :)");
                JOptionPane.showMessageDialog(null, "Nombre del"
                        + " dueño: " + dueños[i].getNombre()
                        + "\nApellidos: " + dueños[i].getApellidos() +"\nCedula: " 
                        + dueños[i].getCedula()
                        + "\nTelefono: " + dueños[i].getNumeroTelefono());

                break;
            }
        }
    }

    public void MostrarInfoDueño() {
        String IDdueno = JOptionPane.showInputDialog(null,
                "Ingrese la cedula del dueño:");
        boolean existe = false;
        for (int i = 0; i < dueños.length; i++) {
            if (IDdueno.equals(dueños[i].getCedula())) {
                JOptionPane.showMessageDialog(null, "La informacion"
                        + "del dueno con cedula " + IDdueno + " es:\n"
                        + "Nombre: " + dueños[i].getNombre() + " \n"
                        + "Apellidos: "
                        + dueños[i].getApellidos() + "\n"
                        + "Numero de telefono:" + dueños[i].getNumeroTelefono());
                existe = true;
            }     
        }
        if (existe == false) {
            JOptionPane.showMessageDialog(null, "No hay ningun "
                    + "dueño registrado bajo la cedula " + IDdueno);
        }
    }

    public void AgregarMascota() {
        //Verifica si el arreglo de mascotas esta inicializado
        for (int i = 0; i < mascotas.length; i++) {
            if (mascotas[i] == null) {
                Func.inicializarArregloMascotas(mascotas, i);
            }
        }

        //Guarda la informacion de la mascota
        for (int i = 0; i < mascotas.length; i++) {
            if (mascotas[i].getNombreMascota() == null) {
                String Nombre = JOptionPane.showInputDialog("Ingrese el "
                        + "nombre de la mascota:");
                String FechaN = JOptionPane.showInputDialog("Ingrese la "
                        + "fecha de nacimiento de la mascota:");
                String Raza = JOptionPane.showInputDialog("Ingrese la"
                        + "raza:");
                String MarcaAl = JOptionPane.showInputDialog("Ingrese la "
                        + "marca del alimento que consume:");
                String Castrado = JOptionPane.showInputDialog("La mascota "
                        + "esta castrada, responda con si o no:");
                String cedDueño = JOptionPane.showInputDialog("Ingrese la "
                        + "cédula del dueño");
                String Diagnostico = JOptionPane.showInputDialog("Ingrese "
                        + "el diagnostico:");
                String ID = Func.generarID();
                String IDDoc = JOptionPane.showInputDialog("Ingrese el ID "
                        + "del doctor:");

                //Verficar que el ID no se repita
                for (int j = 0; j < mascotas.length; j++) {
                    while (mascotas[j].getIDMascota() == ID) {
                        JOptionPane.showMessageDialog(null, 
                                "El ID de la mascota ya existe, "
                                        + "generando uno nuevo...");
                        ID = Func.generarID();
                        mascotas[i].setIDdoctor(ID);
                    }
                }

                mascotas[i] = new Mascota(Nombre, FechaN,
                        Raza, MarcaAl, Castrado,
                        cedDueño, Diagnostico, ID,
                        IDDoc);

                JOptionPane.showMessageDialog(null, "Mascota "
                        + "guardada con exito :)");
                JOptionPane.showMessageDialog(null, "Nombre de la "
                        + "mascota: " + mascotas[i].getNombreMascota()
                        + "\nFecha de nacimiento: " 
                        + mascotas[i].getFechaNacimiento()
                        + "\nRaza: " + mascotas[i].getRazaMascota()
                        + "\nMarca de alimento: " 
                        + mascotas[i].getMarcaAlimento()
                        + "\nEstado de castración:" 
                        + mascotas[i].getMarcaAlimento()
                        + "\nCedula del Dueño:" + mascotas[i].getCedulaDueno()
                        + "\nDiagnostico:" + mascotas[i].getDiagnostico()
                        + "\nID de la mascota:" + mascotas[i].getIDMascota()
                        + "\nID del Doctor:" + mascotas[i].getIDdoctor());

                break;
            }
        }
    }

    public void MostrarMascotasSede() {
        for (int i = 0; i < mascotas.length; i++) {
            if (mascotas[i].getNombreMascota() != null) {
                JOptionPane.showMessageDialog(null, "Nombre de la "
                        + "mascota: " + mascotas[i].getNombreMascota()
                        + "\nFecha de nacimiento: " 
                        + mascotas[i].getFechaNacimiento()
                        + "\nRaza: " + mascotas[i].getRazaMascota()
                        + "\nMarca de alimento: " 
                        + mascotas[i].getMarcaAlimento()
                        + "\nEstado de castración:" 
                        + mascotas[i].getMarcaAlimento()
                        + "\nCedula del Dueño:" + mascotas[i].getCedulaDueno()
                        + "\nDiagnostico:" + mascotas[i].getDiagnostico()
                        + "\nID de la mascota:" + mascotas[i].getIDMascota()
                        + "\nID del Doctor:" + mascotas[i].getIDdoctor());
            }
        }
    }
    //punto f

    public void MostrarInfoMascota() {
        String IDMascota = JOptionPane.showInputDialog(null,
                "Ingrese el ID de la mascota");
        boolean existe = false;
        for (int i = 0; i < mascotas.length; i++) {
            if (IDMascota.equals(mascotas[i].getIDMascota())) {
                JOptionPane.showMessageDialog(null, "La informacion"
                        + "de la mascota con codigo ID: " + IDMascota + " es: \n"
                        + "Nombre: " + mascotas[i].getNombreMascota() + " \n"
                        + "Fecha de nacimiento: " 
                        + mascotas[i].getFechaNacimiento() + "\n"
                        + "Raza: " + mascotas[i].getRazaMascota() + "\n"
                        + " Marca alimento: " 
                        + mascotas[i].getMarcaAlimento() + "\n"
                        + "Estado de castracion: " 
                        + mascotas[i].getEstadoCastracion() + "\n"
                        + "Cedula dueño: " + mascotas[i].getCedulaDueno() + "\n"
                        + "Diagnostico: " + mascotas[i].getDiagnostico() + "\n"
                        + "ID Mascota: " + mascotas[i].getIDMascota() + "\n"
                        + "ID doctor " + mascotas[i].getIDdoctor() + "\n");
                existe = true;
            }
        }
        if (existe == false) {
            JOptionPane.showMessageDialog(null, "No hay ninguna"
                    + "mascota bajo ese ID" + IDMascota);
        }
    }

    public void AgregarDiagnostico() {
        String ID = JOptionPane.showInputDialog("Ingrese el ID de la "
                + "mascota: ");
        String Diagnostico = JOptionPane.showInputDialog("Ingrese el "
                + "diagnostico de la mascota: ");

        for (int i = 0; i < mascotas.length; i++) {
            if (ID.equals(mascotas[i].getIDMascota())) {
                mascotas[i].setDiagnostico(Diagnostico);
                JOptionPane.showMessageDialog(null, "Nuevo "
                        + "diagnostico "
                        + "registrado para la mascota " + ID + " :\n"
                        + Diagnostico);

            }
        }

    }

    public void AgregarDoctor() {
        //Verifica si el arreglo de doctores esta inicializado
        for (int i = 0; i < doctores.length; i++) {
            if (doctores[i] == null) {
                Func.inicializarArregloDoctores(doctores, i);
            }
        }

        for (int i = 0; i < doctores.length; i++) {
            if (doctores[i].getNombre() == null) {
                String Nombre = JOptionPane.showInputDialog("Ingrese el "
                        + "nombre del doctor:");
                String Apellidos = JOptionPane.showInputDialog("Ingrese "
                        + "los apellidos del doctor:");
                String Cedula = JOptionPane.showInputDialog("Ingrese la "
                        + "cedula del doctor:");
                String IDdoctor = Func.generarID();
                String IDSede = NumSede;

                //Verificar que el ID no se repita
                for (int j = 0; j < doctores.length; j++) {
                    while (doctores[j].getIDdoctor() == IDdoctor) {
                        JOptionPane.showMessageDialog(null, 
                                "El ID del doctor ya existe, generando"
                                        + " uno nuevo...");
                        IDdoctor = Func.generarID();
                        doctores[i].setIDdoctor(IDdoctor);
                    }
                }

                doctores[i] = new Doctor(Nombre, Apellidos, 
                        Cedula, IDdoctor, IDSede);

                JOptionPane.showMessageDialog(null, "Doctor "
                        + "guardado con exito :)");
                JOptionPane.showMessageDialog(null, "Nombre: " 
                        + doctores[i].getNombre()
                        + "\nApellidos: " + doctores[i].getApellidos() 
                        + "\nCedula: " + doctores[i].getCedula()
                        + "\nID Sede: " + doctores[i].getNumeroSede() + 
                        "\nID Doctor: " + doctores[i].getIDdoctor());

                break;
            }
        }
    }

    public void InfoDuenoConIDmascota() {
        String busqueda = JOptionPane.showInputDialog("Ingrese el "
                + "ID de la mascota para mostrar la informacion del dueño: ");
        String CedDueno="";
        boolean existedueno = false;
        boolean existemascota = false;
        //Se busca el ID dentro del array de mascotas para extraer el ID del dueño
        for (int i = 0; i < mascotas.length; i++) {
            if (busqueda.equals(mascotas[i].getIDMascota())) {
                CedDueno = mascotas[i].getCedulaDueno();
            }
            existedueno = true;
            if (existedueno == false) {
                JOptionPane.showMessageDialog(null, "No hay ninguna "
                        + "mascota registrada bajo el ID "+busqueda);
            }
        }
        //se busca el ID extraido y se ocmpara con el array de Dueño
        for (int i = 0; i < dueños.length; i++) {
            if (CedDueno.equals(dueños[i].getCedula())) {
                JOptionPane.showMessageDialog(null, "Nombre dueño:"
                        + dueños[i].getNombre() + "\nApellidos:" 
                        + dueños[i].getApellidos()
                        + "\nCedula:" + dueños[i].getCedula() +
                        "\nNumero de telefono:"
                        + dueños[i].getNumeroTelefono());
                existemascota = true;
                break;
            } 
            if (existemascota == false) {
                JOptionPane.showMessageDialog(null, "No hay ningun "
                        + "dueño asosiado a la mascota");
            }
        }
    }

    public void InfoMascotaConIDdueno() {
        String busqueda = JOptionPane.showInputDialog("Ingrese la cedula "
                + "del dueño para mostrar la informacion de la mascota:");
        String Cedula ="";
        boolean existedueno = false;
        boolean existemascota = false;

        //Se busca la cedula del dueño dentro del array y se extrae
        for (int i = 0; i < dueños.length; i++) {
            if (busqueda.equals(dueños[i].getCedula())) {
                Cedula=dueños[i].getCedula();
                existedueno = true;
            }
            if (existedueno == false) {
                JOptionPane.showMessageDialog(null, "No hay ningun "
                        + "dueño registrado con el ID:"+busqueda);
            }
        }
        //se compara la cedula extraida y se busca en el array de mascotas
        for (int i = 0; i < mascotas.length; i++) {
            if (Cedula.equals(mascotas[i].getCedulaDueno())) {
                JOptionPane.showMessageDialog(null, "Nombre de la "
                        + "mascota: " + mascotas[i].getNombreMascota()
                        + "\nFecha de nacimiento: "
                        + mascotas[i].getFechaNacimiento()
                        + "\nRaza: " + mascotas[i].getRazaMascota()
                        + "\nMarca de alimento: " 
                        + mascotas[i].getMarcaAlimento()
                        + "\nEstado de castración:" 
                        + mascotas[i].getMarcaAlimento()
                        + "\nCedula del Dueño:" + mascotas[i].getCedulaDueno()
                        + "\nDiagnostico:" + mascotas[i].getDiagnostico()
                        + "\nID de la mascota:" + mascotas[i].getIDMascota()
                        + "\nID del Doctor:" + mascotas[i].getIDdoctor());
                existemascota = true;
                break;
            }
            if (existemascota == false) {
                JOptionPane.showMessageDialog(null, "No hay ningun "
                        + "dueño asosiado a la mascota");
            }
        }
    }
}
