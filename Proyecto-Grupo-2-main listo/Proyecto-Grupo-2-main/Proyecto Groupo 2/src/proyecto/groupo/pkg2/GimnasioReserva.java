/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.groupo.pkg2;

/**
 *
 * @author jdsan
 */
public class GimnasioReserva {
 private int idEmpleado;
    private String hora;       // 2pm - 7pm
    private boolean activa;

    public GimnasioReserva(int idEmpleado, String hora) {
        this.idEmpleado = idEmpleado;
        this.hora = hora;
        this.activa = true;
    }

    public int getIdEmpleado() { return idEmpleado; }
    public String getHora() { return hora; }
    public boolean isActiva() { return activa; }
    public void setActiva(boolean activa) { this.activa = activa; }

}
