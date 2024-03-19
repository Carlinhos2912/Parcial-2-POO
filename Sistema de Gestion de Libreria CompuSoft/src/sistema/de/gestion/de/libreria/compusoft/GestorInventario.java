package sistema.de.gestion.de.libreria.compusoft;

public interface GestorInventario {

    public abstract void agregarAStock(Inventario inventario, Libro libro);
    public abstract void eliminarDeStock(Inventario inventario, Libro libro);
    public abstract void agregarAPrestamos(Inventario inventario, Libro libro);
    public abstract void eliminarDePrestamos(Inventario inventario, Libro libro);
    
}
