package sistema.de.gestion.de.libreria.compusoft;

import java.util.ArrayList;

public class Inventario implements GestorInventario {

    private ArrayList<Libro> stock;
    private ArrayList<Libro> prestamos;

    public Inventario() {
        this.stock = new ArrayList<Libro>();
        this.prestamos = new ArrayList<Libro>();
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
    public void eliminarDeStock(Libro libro) {
        Boolean est = false;
        for (Libro muestra : this.getStock()) {
            if (muestra.getIsbn().equals(libro.getIsbn())) {
                this.getStock().remove(muestra);
                est = true;
                break;
            }
        }
        if (!est) {
            System.out.println("El libro no se encuentra registrado");
        }
    }

    @Override
    public void agregarAPrestamos(Libro libro) {
        Boolean est = false;
        for (Libro muestra : this.getStock()) {
            if (muestra.getIsbn().equals(libro.getIsbn()) && muestra.consultarDisponibilidad()) {
                muestra.setDisponibles(muestra.getDisponibles() - 1);
                this.getPrestamos().add(libro); // else try inventario.setPrestamos(inventario.getPrestamos().add(libro));
                break;
            }
        }
        if (!est) {
            System.out.println("El libro no esta disponible");
        }
    }

    @Override
    public void eliminarDePrestamos(Libro libro) {

        Boolean est = false;
        for (Libro muestra : this.getPrestamos()) {
            if (muestra.getIsbn().equals(libro.getIsbn())) {
                muestra.setDisponibles(muestra.getDisponibles() - 1);
                this.getPrestamos().remove(libro);
                break;
            }
        }
        if (!est) {
            System.out.println("El prestamo del libro " + libro.getTitulo() + " no se encuentra registrado");
        }

    }

    @Override
    public void agregarAStock(Libro libro) {
        Boolean est = false;
        for (Libro muestra : this.getStock()) {
            if (muestra.getIsbn().equals(libro.getIsbn())) {
                muestra.setDisponibles(muestra.getDisponibles() + 1);

                est = true;
                break;
            }
        }
        if (!est) {
            this.getStock().add(libro);
        }
    }

}
