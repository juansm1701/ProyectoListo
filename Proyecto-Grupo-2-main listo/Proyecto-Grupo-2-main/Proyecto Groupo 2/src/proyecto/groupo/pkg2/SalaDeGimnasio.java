/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.groupo.pkg2;

/**
 *
 * @author Laboratorio
 */
public class SalaDeGimnasio {
    private String Entrenador;
    private int horario;

    public String getEntrenador() {
        return Entrenador;
    }

    public void setEntrenador(String Entrenador) {
        this.Entrenador = Entrenador;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public SalaDeGimnasio(String Entrenador, int horario) {
        this.Entrenador = Entrenador;
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "SalaDeGimnasio{" + "Entrenador=" + Entrenador + ", horario=" + horario + '}';
    }
    
    
}
