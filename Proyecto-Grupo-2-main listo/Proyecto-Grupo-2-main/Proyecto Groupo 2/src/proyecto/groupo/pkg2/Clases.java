/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.groupo.pkg2;

/**
 *
 * @author danif
 */
public class Clases {
          
    
    private int idEmpleado;
    private String tipo;       // Baile o Yoga
    private String hora;       // 7 pm o 8 pm
    private boolean activa;
    
    public Clases(int idEmpleado, String tipo, String hora) {
        this.idEmpleado = idEmpleado;
        this.tipo = tipo;
        this.hora = hora;
        this.activa = true;
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}
