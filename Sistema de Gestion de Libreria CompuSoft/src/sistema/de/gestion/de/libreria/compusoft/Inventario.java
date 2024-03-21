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
        for (Libro muestra : stock) {
            if (muestra.getIsbn() == libro.getIsbn()) {
                if (muestra.getDisponibles() == 1) {
                    stock.remove(muestra);
                } else {
                    muestra.setDisponibles(muestra.getDisponibles() - 1);
                }
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
        for (Libro muestra : stock) {
            if (muestra.getIsbn() == libro.getIsbn()) {
                if (muestra.getDisponibles() == 1) {
                    muestra.setDisponibles(muestra.getDisponibles() - 1);
                    prestamos.add(libro); // else try inventario.setPrestamos(inventario.getPrestamos().add(libro));
                    stock.remove(muestra);
                    break;
                } else {
                    prestamos.add(libro);
                    eliminarDeStock(libro);
                    break;
                }
            }
        }
        if (!est) {
            System.out.println("El libro no esta disponible");
        }
    }

    @Override
    public void eliminarDePrestamos(Libro libro) {

        Boolean est = false;
        for (Libro muestra : prestamos) {
            if (muestra.getIsbn() == (libro.getIsbn())) {
                muestra.setDisponibles(muestra.getDisponibles() + 1);
                prestamos.remove(libro);
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
        for (Libro muestra : stock) {
            //Si el libro esta en stock
            if (muestra.getIsbn() == (libro.getIsbn())) {
                //Suma uno a los disponibles
                muestra.setDisponibles(muestra.getDisponibles() + libro.getDisponibles());
                est = true;
                break;
            }
        }
        //si no esta en stock lo agrega
        if (!est) {
            stock.add(libro);
        }
    }

}
