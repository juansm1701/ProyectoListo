/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.groupo.pkg2;

/**
 *
 * @author danif
 */
public class PedidoBarista {
         private int idEmpleado;
    private int idBebida;
    private String horaEntrega;
    private boolean activa;

    public PedidoBarista(int idEmpleado, int idBebida, String horaEntrega, boolean activa) {
        this.idEmpleado = idEmpleado;
        this.idBebida = idBebida;
        this.horaEntrega = horaEntrega;
        this.activa = true;
    }

    // Getters y Setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdBebida() {
        return idBebida;
    }

    public void setIdBebida(int idBebida) {
        this.idBebida = idBebida;
    }

    public String getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(String horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}
