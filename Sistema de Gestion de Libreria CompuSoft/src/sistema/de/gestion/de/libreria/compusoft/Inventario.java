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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void eliminarDePrestamos(Inventario inventario, Libro libro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static void main(String[] args) {
        Inventario inv = new Inventario(new ArrayList<>(), new ArrayList<>());
        inv.agregarAStock(inv, new Libro("titulo", "autor", "isbn", 15000, 10));
        inv.agregarAStock(inv, new Libro("titulo", "autor", "isbn", 15000, 10));
        System.out.println("Disponibilidad: " + inv.getStock().get(0).consultarDisponibilidad());
        inv.eliminarDeStock(inv, new Libro("titulo", "autor", "isbn", 15000, 10));
        inv.eliminarDeStock(inv, new Libro("titulo", "autor", "isbn", 15000, 10));
    }
    
}
