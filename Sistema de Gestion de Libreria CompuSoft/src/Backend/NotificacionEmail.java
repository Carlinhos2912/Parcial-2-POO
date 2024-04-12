/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import javax.swing.JOptionPane;

/**
 *
 * @author jodav
 */
public class NotificacionEmail extends Notificacion {

    private String email;

    public NotificacionEmail() {
        email = JOptionPane.showInputDialog(null, "Email de cliente: ", "Email", 3);
    }

    public NotificacionEmail(String email) {
        this.email = email;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, email, 1);
    }
}
