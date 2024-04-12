/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.util.ArrayList;

/**
 *
 * @author jodav
 */
public class Pedido {
    private Cliente comprador;
    private Empleado gestor;
    private ArrayList<DetallePedido> detalles;
            
    public Pedido() {
    }

    public Pedido(Cliente comprador, Empleado gestor,ArrayList<DetallePedido> detalles) {
        this.comprador = comprador;
        this.gestor = gestor;
        this.detalles = detalles;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public Empleado getGestor() {
        return gestor;
    }

    public void setGestor(Empleado gestor) {
        this.gestor = gestor;
    }

    public ArrayList<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<DetallePedido> detalles) {
        this.detalles = detalles;
    }
    
}
