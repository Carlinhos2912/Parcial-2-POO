package Backend;

import java.util.ArrayList;

public class Cliente extends Persona {

    private ArrayList<Libro> historialPrestamos;

    public Cliente() {
    }

    public Cliente(ArrayList<Libro> historialPrestamos) {
        this.historialPrestamos = historialPrestamos;
    }

    public Cliente(int id, String nombre, String apellido, ArrayList<Libro> historialPrestamos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.historialPrestamos = historialPrestamos;
    }

    public ArrayList<Libro> getHistorialPrestamos() {
        return historialPrestamos;
    }

    public void setHistorialPrestamos(ArrayList<Libro> historialPrestamos) {
        this.historialPrestamos = historialPrestamos;
    }

}
