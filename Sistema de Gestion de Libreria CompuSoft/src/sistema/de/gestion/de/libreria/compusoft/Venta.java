/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.gestion.de.libreria.compusoft;

/**
 *
 * @author jodav
 */
public class Venta {
    private Empleado vendedor;
    private String fecha;
    private String detalles;

    public Venta() {
    }

    public Venta (Empleado vendedor, String fecha, String detalles) {
        this.vendedor = vendedor;
        this.fecha = fecha;
        this.detalles = detalles;
    }

    public Empleado getVendedor() {
        return vendedor;
    }

    public void setVendedor(Empleado vendedor) {
        this.vendedor = vendedor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
}
