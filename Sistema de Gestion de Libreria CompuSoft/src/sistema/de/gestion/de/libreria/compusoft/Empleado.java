package sistema.de.gestion.de.libreria.compusoft;

public class Empleado extends Persona {

    private String posicion;

    public Empleado() {
    }

    public Empleado(String posicion) {
        this.posicion = posicion;
    }

    public Empleado(int id, String nombre, String apellido, String posicion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
