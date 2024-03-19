package sistema.de.gestion.de.libreria.compusoft;

import java.util.ArrayList;

public class Inventario implements GestorInventario {

    private ArrayList<Libro> stock;
    private ArrayList<Libro> prestamos;

    public Inventario() {
    }

    public Inventario(ArrayList<Libro> stock, ArrayList<Libro> prestamos) {
        this.stock = stock;
        this.prestamos = prestamos;
    }

    public ArrayList<Libro> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Libro> stock) {
        this.stock = stock;
    }

    public ArrayList<Libro> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Libro> prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public void agregarAStock(Inventario inventario, Libro libro) {
        Boolean est = false;
        for (Libro muestra : inventario.getStock()) {
            if (muestra.getIsbn().equals(libro.getIsbn())) {
                muestra.setDisponibles(muestra.getDisponibles() + 1);

                est = true;
                break;
            }
        }
        if (!est) {
            inventario.getStock().add(libro);
        }
    }

    @Override
    public void eliminarDeStock(Inventario inventario, Libro libro) {
        Boolean est = false;
        for (Libro muestra : inventario.getStock()) {
            if (muestra.getIsbn().equals(libro.getIsbn())) {
                inventario.getStock().remove(muestra);
                est = true;
                break;
            }
        }
        if (!est) {
            System.out.println("El libro no se encuentra registrado");
        }
    }

    @Override
    public void agregarAPrestamos(Inventario inventario, Libro libro) {
        Boolean est = false;
        for (Libro muestra : inventario.getStock()) {
            if (muestra.getIsbn().equals(libro.getIsbn()) && muestra.consultarDisponibilidad()) {
                muestra.setDisponibles(muestra.getDisponibles() - 1);
                inventario.getPrestamos().add(libro); // else try inventario.setPrestamos(inventario.getPrestamos().add(libro));
                break;
            }
        }
        if (!est) {
            System.out.println("El libro no esta disponible");
        }
    }

    @Override
    public void eliminarDePrestamos(Inventario inventario, Libro libro) {

        Boolean est = false;
        for (Libro muestra : inventario.getPrestamos()) {
            if (muestra.getIsbn().equals(libro.getIsbn())) {
                muestra.setDisponibles(muestra.getDisponibles() - 1);
                inventario.getPrestamos().remove(libro);
                break;
            }
        }
        if (!est) {
            System.out.println("El prestamo del libro " + libro.getTitulo() + " no se encuentra registrado");
        }

    }
}
