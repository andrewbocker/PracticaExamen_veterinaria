package practicaveterinaria;

public class Func {
    
    public static String generarID(){
        int ID = (int) (Math.random() * 1000);
        String IDString = Integer.toString(ID);
        return IDString;
    }

    // Inicializar el arreglo de doctores
    public static void inicializarArregloDoctores(Doctor[] arrayDoctores, int posicion) {
        arrayDoctores[posicion] = new Doctor(); 
    }

    public static void inicializarArregloMascotas(Mascota[] arrayMascotas, int posicion) {
        arrayMascotas[posicion] = new Mascota(); 
    }

    //Inicializar el arreglo de dueños
    public static void inicializarArregloDueños(Dueño[] arrayDueños, int posicion) {
        arrayDueños[posicion] = new Dueño();
    }
    
    public static void mostrarDoctores(Doctor[] arrayDoctores) {
        for (int i = 0; i < arrayDoctores.length; i++) {
            System.out.println("Nombre: "+arrayDoctores[i].getNombre() + " Apellidos: " + arrayDoctores[i].getApellidos() + " Cedula: " + arrayDoctores[i].getCedula() + " ID: " + arrayDoctores[i].getIDdoctor() + " ID Sede: " + arrayDoctores[i].getNumeroSede());
       }
    }

    public static void mostrarMascotas(Mascota[] arrayMascotas) {
        for (int i = 0; i < arrayMascotas.length; i++) {
            System.out.println("Nombre: "+arrayMascotas[i].getNombreMascota() + "ID: " + arrayMascotas[i].getIDMascota() + "ID Doctor: " + arrayMascotas[i].getIDdoctor() + "Diagnostico: " + arrayMascotas[i].getDiagnostico());
       }
    }

    public static void mostrarDueños(Dueño[] arrayDueños) {
        for (int i = 0; i < arrayDueños.length; i++) {
            System.out.println("Nombre: "+arrayDueños[i].getNombre() + " Apellidos: " + arrayDueños[i].getApellidos() + " Cedula: " + arrayDueños[i].getCedula() + " Numero de telefono: " + arrayDueños[i].getNumeroTelefono());
       }
    }

}
