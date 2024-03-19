package sistema.de.gestion.de.libreria.compusoft;

public class Cliente extends Persona {

    private String[] historialPrestamos;

    public Cliente() {
    }

    public Cliente(String[] historialPrestamos) {
        this.historialPrestamos = historialPrestamos;
    }

    public Cliente(int id, String nombre, String apellido, String[] historialPrestamos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.historialPrestamos = historialPrestamos;
    }

    public String[] getHistorialPrestamos() {
        return historialPrestamos;
    }

    public void setHistorialPrestamos(String[] historialPrestamos) {
        this.historialPrestamos = historialPrestamos;
    }

}
