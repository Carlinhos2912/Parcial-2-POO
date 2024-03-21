/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.gestion.de.libreria.compusoft;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jodav
 */
public class Venta {

    private Pedido pedido;
    private Libro libro;
    private String fecha;

    public Venta() {
    }

    public Venta(Pedido pedido, Libro libro, String fecha) {
        this.pedido = pedido;
        this.libro = libro;
        this.fecha = fecha;
    }

    public Venta(Cliente comprador, Empleado gestor, ArrayList<DetallePedido> detalles, Libro libro) {
        int c = 1;
        detalles.add(new DetallePedido(JOptionPane.showInputDialog(null, "Ingrese detalle de pedido #" + c + ": ", "Detalle de Pedido", 3)));
        c++;
        while (true) {
            if (JOptionPane.showConfirmDialog(null, "Desea ingresar Detalle de Pedido?", "Continuar", JOptionPane.YES_NO_OPTION, 3) == 0) {
                detalles.add(new DetallePedido(JOptionPane.showInputDialog(null, "Ingrese detalle de pedido #" + c + ": ", "Detalle de Pedido", 3)));
                c++;
            } else {
                break;
            }
        }
        pedido = new Pedido(comprador, gestor, detalles);
        this.libro = libro;
        this.fecha = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
