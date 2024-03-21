/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.gestion.de.libreria.compusoft;

import javax.swing.JOptionPane;

/**
 *
 * @author jodav
 */
public class NotificacionSMS extends Notificacion {

    private int numero;

    public NotificacionSMS() {
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero telefono del cliente: ", "SMS", 3));
    }

    public NotificacionSMS(int numero) {
        this.numero = numero;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "" + numero, 1);
    }
}
