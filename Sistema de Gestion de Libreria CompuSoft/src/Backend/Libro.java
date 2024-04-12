package Backend;

public class Libro implements Consultable {

    private String titulo;
    private String autor;
    private long isbn;
    private double precio;
    private int disponibles;

    public Libro() {
    }

    public Libro(String titulo, String autor, long isbn, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        disponibles = 1;
    }
    
    public Libro(String titulo, String autor, long isbn, double precio, int disponibles) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.disponibles = disponibles;
    }
    
    public Libro(String titulo, String autor, long isbn, double precio, Inventario inventario) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        for (Libro libro : inventario.getStock()) {
            if (libro.getIsbn() == this.isbn){
                disponibles ++;
            }
        }
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }

    @Override
    public Boolean consultarDisponibilidad() {
        return disponibles > 0;
    }

    @Override
    public double consultarPrecio() {
        return precio;
    }

}
