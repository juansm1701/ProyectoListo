/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.groupo.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class SalaDeCine {
    private String Pelicula;
    private String sillas [][];
    private Empleado[][] empleados;
    
    public SalaDeCine(String Pelicula, int filasSillas, int columnasSillas) {
        this.Pelicula = Pelicula;
        this.sillas = new String [filasSillas][columnasSillas];
    }

    public String getPelicula() {
        return Pelicula;
    }

    public void setPelicula(String Pelicula) {
        this.Pelicula = Pelicula;
    }

    public String[][] getSillas() {
        return sillas;
    }

    public void setSillas(int filasSillas, int columnasSillas) {
        
        for (int i = 0; i < filasSillas; i++) {
            for (int j = 0; j < columnasSillas; j++) {
                if (empleados == null){
                    sillas[i][j] = "L";
                }else if(empleados[i][j] == null){
                    sillas[i][j] = "L"; 
                }else{
                    sillas[i][j] = "O";
                }
                
            }
        }
    }

    public Empleado[][] getEmpleado() {
        return empleados;
    }

    public void setEmpleado(int filasSillas, int columnasSillas) {
        this.empleados = new Empleado [filasSillas][columnasSillas];
        
    }


    
    
    @Override
    public String toString() {
        return "SalaDeCine{" + "Pelicula=" + Pelicula + ", sillas=" + sillas + '}';
    }

   
    
    public String MostrarCine  (int filasSillas, int columnasSillas) {
        setSillas(filasSillas, columnasSillas);
        String sala = "Pelicula: " + this.Pelicula;
        sala += "\n";
        sala += "L: Libre";
        sala += "\n";
        sala += "O: Ocupado";
        sala += "\n";
        sala += "        ___________ Pantalla";
        
        String letras = "ABCDEFGHIJKMNLOPQRSTUVWXYZ";
        for (int i = 0; i < this.sillas.length; i++) {
            sala += "\n";
            sala += letras.charAt(i) + "      ";
            
            for (int j = 0; j < this.sillas[0].length; j++) {
                sala += sillas[i][j] + "  ";    
            }
        }
        sala += "\n";
        sala += "        ";
        for (int i = 0; i < this.sillas[0].length; i++) {
            sala += (i+1) + "  ";
        }
        
        JOptionPane.showMessageDialog(null, sala);
        return sala;
    }
    
    public void AsignarEmpleado (String filaEspacio, int seleccion, int empleado){
        this.empleados = new Empleado[sillas.length][sillas[0].length];
        String letras = "ABCDEFGHIJKMNLOPQRSTUVWXYZ";
        int seleccionFila = letras.indexOf(filaEspacio);
        if (seleccionFila > sillas.length){
                JOptionPane.showMessageDialog(null, "Seleccion invalida");
                return;
            }else{
              empleados[seleccionFila][seleccion].setId(empleado);
            }
                    
                    
        
            
            
        }
    }

