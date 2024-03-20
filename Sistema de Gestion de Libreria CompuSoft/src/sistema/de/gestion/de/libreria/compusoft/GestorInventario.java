package sistema.de.gestion.de.libreria.compusoft;

public interface GestorInventario {

    public abstract void agregarAStock(Libro libro);
    public abstract void eliminarDeStock(Libro libro);
    public abstract void agregarAPrestamos(Libro libro);
    public abstract void eliminarDePrestamos(Libro libro);
    
}
