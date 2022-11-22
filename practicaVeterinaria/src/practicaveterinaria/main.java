/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaveterinaria;

import javax.swing.JOptionPane;

/**
 *
 * @author fanta
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int W = 0;
        while (W == 0) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "_______Bienvenid@_______\nIngrese la opcion que desea:"
                    + "\n1.Agregar la sede.\n2.Salir del programa."));
            if (opcion == 1) {
                String NumSede = JOptionPane.showInputDialog("Ingrese el "
                        + "numero de sede:");
                String Localizacion = JOptionPane.showInputDialog("Ingrese "
                        + "la localizacion de la sede:");
                Sede sede1 = new Sede(NumSede, Localizacion, null,
                        null, null);
                int Z = 0;
                while (Z == 0) {
                    int opcion2 = Integer.parseInt(JOptionPane.showInputDialog(
                            "Ingrese la opcion que desea:"
                            + "\n1.Agregar cliente(dueño)."
                            + "\n2.Agregar doctor.\n3.Agregar paciente(mascota)"
                            + "\n4.Mostrar toda la información del cliente."
                            + "\n5.Mostrar toda la información de una mascota."
                            + "\n6.Mostrar la información del dueño dado el ID de "
                            + "la mascota.\n7.Mostrar la información de la mascota "
                            + "dado la cedula del dueño."
                            + "\n8.Agregar un diagnóstico a una mascota dado un ID."
                            + "\n9.Mostrar todas las mascotas de la sede."
                            + "\n10.Salir del programa"));

                    if (opcion2 == 1) {
                        sede1.AgregarDueño();
                    }
                    if (opcion2 == 2) {
                        sede1.AgregarDoctor();
                    }
                    if (opcion2 == 3) {
                        sede1.AgregarMascota();
                    }
                    if (opcion2 == 4) {
                        sede1.MostrarInfoDueño();
                    }
                    if (opcion2 == 5) {
                        sede1.MostrarInfoMascota();
                    }
                    if (opcion2 == 6) {
                        sede1.InfoDuenoConIDmascota();
                    }
                    if (opcion2 == 7) {
                        sede1.InfoMascotaConIDdueno();
                    }
                    if (opcion2 == 8) {
                        sede1.AgregarDiagnostico();
                    }
                    if (opcion2 == 9) {
                        sede1.MostrarMascotasSede();
                    }
                    if (opcion2 == 10) {
                        JOptionPane.showMessageDialog(null, "Gracias"
                                + " por utilizar el sistema :)");
                        Z = 1;
                        W = 1;
                    }
                    if (opcion2 == 0 || opcion2 > 10) {
                        JOptionPane.showMessageDialog(null, "Opcion "
                                + "invalida, intente de nuevo");
                    }
                }
            }
            if (opcion == 2) {
                JOptionPane.showMessageDialog(null, "Gracias"
                        + " por utilizar el sistema :)");
                W = 1;
            }
            if (opcion == 0 || opcion > 2) {
                JOptionPane.showMessageDialog(null, "Opcion "
                        + "invalida, intente de nuevo");
            }
        }
    }

}    

