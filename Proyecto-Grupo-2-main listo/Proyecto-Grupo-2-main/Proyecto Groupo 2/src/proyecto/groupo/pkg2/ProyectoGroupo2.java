/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.groupo.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class ProyectoGroupo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables para Cines
        int filasSalas = 5;
        int columnasSalas = 6;
        int cantidadSalas = 2;
        String pelicula = " ";
        SalaDeCine[] sala = CrearCines(filasSalas, columnasSalas,cantidadSalas, pelicula);
        Menu(filasSalas,columnasSalas, cantidadSalas, sala);
    }
    
         // Datos
    
    public static Empleado[] empleados = {
        new Empleado( "Juan Sanchez", 1001),
        new Empleado("Luis Perez", 1002),
        new Empleado("Maria Rodriguez", 1003),
        new Empleado("Carlos Lopez", 1004),
        new Empleado("Sofia Martinez", 1005)
    };
    
    
    
   

    
        public static Bebida[] bebidas = {
        new Bebida(1, "Café normal"),
        new Bebida(2, "Capuchino"),
        new Bebida(3, "Capuchino con vainilla"),
        new Bebida(4, "Chocolate"),
        new Bebida(5, "Moka"),
        new Bebida(6, "Te chai"),
        new Bebida(7, "Café frío")
    };

    public static Clases[] reservasClases = new Clases[200];
    public static int reservasCount = 0;

    public static PedidoBarista[] ordenes = new PedidoBarista[200];
    public static int ordenesCount = 0;

    public static int CUPO_MAX = 30;
    
   public static GimnasioReserva[] reservasGym = new GimnasioReserva[50]; // máximo 50 reservas
   public static int reservasGymCount = 0; 
    
   public static void Menu (int filasSalas,int columnasSalas, int cantidadSalas, SalaDeCine[] sala) {
       while (true) {
           String menu = "=======Sistema de gestion de beneficios empresariales=======";
            menu += "\n";
            menu += "Seleccione una de las siguientes opciones:";
            menu += "\n";
            menu += "1- Cine";
            menu += "\n";
            menu += "2- Gimnasio";
            menu += "\n";
            menu += "3- Clases";
            menu += "\n";
            menu += "4- Cafeteria";
            menu += "\n";
            menu += "5- Salir";
            int seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch (seleccion) {
               case 1:
                   MenuCine(filasSalas,columnasSalas, cantidadSalas, sala);
                   break;
               case 2:
                   menuGimnasio();
                   break;
               case 3:
                   menuClases();
                   break;
               case 4:
                   menuBebidas();
                   break;
               case 5:
                   return;
           }
       }
       
    }
        
   public static void MenuCine (int filasSalas,int columnasSalas, int cantidadSalas, SalaDeCine[] sala){
       while (true) {           
          String menu = "=======Menu del Cine=======";
            menu += "\n";
            menu += "Seleccione una de las siguientes opciones:";
            menu += "\n";
            menu += "1- Ver salas";
            menu += "\n";
            menu += "2- Modificar salas";
            menu += "\n";
            menu += "3- Crear sala";
            menu += "\n";
            menu += "4- Gestionar reservaciones";
            menu += "\n";
            menu += "5- volver";
            menu += "\n";
            int seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (seleccion) {
              case 1:
                   VerCines(sala, filasSalas, columnasSalas, cantidadSalas);
                   break;
              case 2:
                  ModificarCines(sala, filasSalas, columnasSalas, cantidadSalas);
                  break;
              case 3:
                  NuevasSalasCine(sala, filasSalas, columnasSalas, cantidadSalas);
                  cantidadSalas++;
                  break;
              case 4:
                  GestionReservacion(sala, filasSalas, columnasSalas, cantidadSalas);
                  break;
              case 5:
                  return;
            }
        }
    }   
   
   
   public static SalaDeCine[] CrearCines(int filasSalas, int columnasSalas, int cantidadSalas, String pelicula){
        
        SalaDeCine[] sala = new SalaDeCine[cantidadSalas + 100];
        
        for (int i = 0; i < cantidadSalas; i++) {
            switch (i){
                case 0:
                 sala[i] = new SalaDeCine("Shrek 2", filasSalas, columnasSalas);
                 sala[i].setSillas(filasSalas, columnasSalas);
                 sala[i].setEmpleado(filasSalas, columnasSalas);
                 break;   
                case 1:
                 sala[i] = new SalaDeCine("Alien", filasSalas, columnasSalas);
                 sala[i].setSillas(filasSalas, columnasSalas);
                 sala[i].setEmpleado(filasSalas, columnasSalas);
                 break;
                }
            }
        return sala;
    }
   
   
   public static void VerCines(SalaDeCine[] sala, int filasSalas, int columnasSalas, int cantidadSalas){
       while (true) {   
            String listaSalas = "=======Salas de Cine=======";
            listaSalas += "\n";

            for (int i = 0; i < cantidadSalas; i++) {
                listaSalas += "Sala " + (i+1) + ": ";
                listaSalas += sala[i].getPelicula();
                listaSalas += "\n";
             }
            listaSalas += "Seleccione que sala desea ver. Utilize \"-1\" para salir";
            int seleccion = Integer.parseInt(JOptionPane.showInputDialog(listaSalas));

            for (int i = 0; i < cantidadSalas; i++) {
                if (seleccion == -1) {
                    return;
                }else if (seleccion == (i+1)){
                    sala[i].MostrarCine(filasSalas, columnasSalas);
                    break;
                }
            }
       }
       
   }
   
   public static void ModificarCines(SalaDeCine[] sala, int filasSalas, int columnasSalas, int cantidadSalas){
       String menu = "=======Salas Disponibles=======";
       menu += "\n";
       for (int i = 0; i < cantidadSalas; i++) {
           menu += "Sala " + (i+1) + ": ";
           menu += sala[i].getPelicula() + " " ;
           menu += "cantidad de asientos: " + (sala[i].getSillas().length * sala[i].getSillas()[0].length);
           menu += "\n";
        }
       menu += "Seleccione cual sala modificar.Ingrese \"-1\" para salir";
       int seleccionSala = Integer.parseInt(JOptionPane.showInputDialog(menu));
       menu = "¿Que desea modificar de la sala " + seleccionSala + "?";
       menu += "\n";
       menu += "1- Pelicula";
       menu += "\n";
       menu += "2- Cantidad de Sillas";
       menu += "\n";
       menu += "3- Menu anterior";
       int seleccionModificar = Integer.parseInt(JOptionPane.showInputDialog(menu));
       switch (seleccionModificar) {
           case 1:
               sala[(seleccionSala-1)].setPelicula(JOptionPane.showInputDialog("Ingrese el nombre de la pelicula"));
               break;
           case 2:
               filasSalas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas"));
               columnasSalas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de columnas"));
               sala[(seleccionSala-1)].setSillas(filasSalas,columnasSalas);
               break;
           case 3:
               break;               
       }
   }
   
   
  public static void NuevasSalasCine (SalaDeCine[] sala, int filasSalas, int columnasSalas, int cantidadSalas){
    for (int i = 0; i < sala.length; i++) {
        if (sala[i] == null) {

            String pelicula = JOptionPane.showInputDialog("Ingrese el nombre de la pelicula");

            int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas"));
            int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de columnas"));

            sala[i] = new SalaDeCine(pelicula, filas, columnas);
            sala[i].setSillas(filas, columnas);

            break;
        }
    }
}

  public static void GestionReservacion(SalaDeCine[] sala, int filasSalas, int columnasSalas, int cantidadSalas){
      String menu = "=======Gestion de reservaciones de cine=======";
      menu += "\n";
      menu += "1- Realizar reservación";
      menu += "\n";
      menu += "2- Cancelar Reservación";
      menu += "\n";
      menu += "3- Ver reservaciones";
      menu += "\n";
        menu += "4- Volver";
        int seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (seleccion) {
            case 1:
                menu = "Ingrese en cual sala realizar la reservación";
                for (int i = 0; i < cantidadSalas; i++) {
                    menu += "Sala " + (i + 1) + ": ";
                    menu += sala[i].getPelicula() + " ";
                    menu += "cantidad de asientos: " + (sala[i].getSillas().length * sala[i].getSillas()[0].length);
                    menu += "\n";
                    seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
                    for (int j = 0; j < cantidadSalas; j++) {
                        if (seleccion == (i+1)){
                            menu = "Seleccione la fila del espacio a reservar";
                            menu += "\n";
                            menu += sala[i].MostrarCine(filasSalas, columnasSalas);
                            String filaEspacio = JOptionPane.showInputDialog(menu);
                            
                            menu = "Fila seleccionada: " + filaEspacio;
                            menu += "\n";
                            menu += "Seleccione el espacio a reservar";
                            menu += "\n";
                            menu += sala[i].MostrarCine(filasSalas, columnasSalas);
                            seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
                            int empleado = pedirIdEmpleado();
                            sala[i].AsignarEmpleado(filaEspacio, seleccion, empleado);
                            
                        }
                    }
                }
                
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
        }
    }
    
    //Menu clases
    public static void menuClases() {
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                "Menú Clases:\n1. Reservar clase\n2. Listar reservas\n3. Liberar reserva\n4. Visualizar cupos\n0. Volver");
            if (opcion == null || opcion.equals("0")) return;
            if (opcion.equals("1")) {
                reservarClase();
            } else if (opcion.equals("2")) {
                listarReservasClases();
            } else if (opcion.equals("3")) {
                liberarReservaClase();
            } else if (opcion.equals("4")) {
                visualizarClases();
            } else {
                JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        }
    }

    public static void reservarClase() {
        int idEmpleado = pedirIdEmpleado();
        if (idEmpleado == -1) return;

        String tipo = JOptionPane.showInputDialog("Digite tipo de clase (Baile/Yoga):");
        if (tipo == null || tipo.equals("")) return;

        String hora = JOptionPane.showInputDialog("Digite hora (ej: 10am):");
        if (hora == null || hora.equals("")) return;

        if (contarOcupadosClase(tipo, hora) >= CUPO_MAX) {
            JOptionPane.showMessageDialog(null, "Cupo lleno");
            return;
        }

        reservasClases[reservasCount] = new Clases(idEmpleado, tipo, hora);
        reservasCount++;
        JOptionPane.showMessageDialog(null, "Reserva creada para " + obtenerNombreEmpleado(idEmpleado));
    }

    public static void listarReservasClases() {
        String lista = "Reservas:\n";
        for (int i = 0; i < reservasCount; i++) {
            Clases r = reservasClases[i];
            if (r != null) {
                lista = lista + r.getTipo() + " - " + r.getHora() + " - " +
                        obtenerNombreEmpleado(r.getIdEmpleado()) + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    public static void liberarReservaClase() {
        int idEmpleado = pedirIdEmpleado();
        if (idEmpleado == -1) return;

        for (int i = 0; i < reservasCount; i++) {
            Clases r = reservasClases[i];
            if (r != null && r.getIdEmpleado() == idEmpleado) {
                reservasClases[i] = null;
                JOptionPane.showMessageDialog(null, "Reserva liberada");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró reserva");
    }

    public static void visualizarClases() {
        String tipo = JOptionPane.showInputDialog("Digite tipo de clase (Baile/Yoga):");
        if (tipo == null || tipo.equals("")) return;
        String hora = JOptionPane.showInputDialog("Digite hora:");
        if (hora == null || hora.equals("")) return;
        int ocupados = contarOcupadosClase(tipo, hora);
        JOptionPane.showMessageDialog(null, "Ocupados: " + ocupados + "/" + CUPO_MAX);
    }

    public static int contarOcupadosClase(String tipo, String hora) {
        int count = 0;
        for (int i = 0; i < reservasCount; i++) {
            Clases r = reservasClases[i];
            if (r != null && r.getTipo().equals(tipo) && r.getHora().equals(hora)) {
                count++;
            }
        }
        return count;
    }
    
    // Menu bebidas
    public static void menuBebidas() {
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                "Menú Bebidas:\n1. Crear orden\n2. Modificar orden\n3. Listar órdenes\n4. Anular orden\n0. Volver");
            if (opcion == null || opcion.equals("0")) return;
            if (opcion.equals("1")) {
                crearOrden();
            } else if (opcion.equals("2")) {
                modificarOrden();
            } else if (opcion.equals("3")) {
                listarOrdenes();
            } else if (opcion.equals("4")) {
                anularOrden();
            } else {
                JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        }
    }
    //Menu Gimnasio
    public static void menuGimnasio() {
    while (true) {
        String opcion = JOptionPane.showInputDialog(
            "Menú Gimnasio:\n1. Reservar hora con entrenador\n2. Listar reservas\n3. Liberar reserva\n4. Visualizar horarios\n0. Volver");
        if (opcion == null || opcion.equals("0")) return;
        switch (opcion) {
            case "1": reservarGym(); break;
            case "2": listarReservasGym(); break;
            case "3": liberarReservaGym(); break;
            case "4": visualizarGym(); break;
            default: JOptionPane.showMessageDialog(null, "Opción inválida");
        }
    }
}

    public static void crearOrden() {
        
        int idEmpleado = pedirIdEmpleado();
        if (idEmpleado == -1) return;

        if (tieneOrdenActiva(idEmpleado)) {
            JOptionPane.showMessageDialog(null, "Ya tiene una orden activa");
            return;
        }

        String nombreBebida = JOptionPane.showInputDialog("Digite nombre de bebida:");
        if (nombreBebida == null || nombreBebida.equals("")) return;

        int idBebida = obtenerIdBebida(nombreBebida);
        if (idBebida == -1) {
            JOptionPane.showMessageDialog(null, "Bebida no encontrada");
            return;
        }

        ordenes[ordenesCount] = new PedidoBarista(idEmpleado, idBebida,"10:30am", true);
        ordenesCount++;
        JOptionPane.showMessageDialog(null, "Orden creada para " + obtenerNombreEmpleado(idEmpleado));
    }

    public static void modificarOrden() {
        int idEmpleado = pedirIdEmpleado();
        if (idEmpleado == -1) return;

        int pos = buscarOrdenActiva(idEmpleado);
        if (pos == -1) {
            JOptionPane.showMessageDialog(null, "No tiene orden activa");
            return;
        }

        String nuevaBebida = JOptionPane.showInputDialog("Digite nueva bebida:");
        if (nuevaBebida == null || nuevaBebida.equals("")) return;

        int idBebida = obtenerIdBebida(nuevaBebida);
        if (idBebida == -1) {
            JOptionPane.showMessageDialog(null, "Bebida no encontrada");
            return;
        }

        ordenes[pos].setIdBebida(idBebida);
        JOptionPane.showMessageDialog(null, "Orden modificada");
    }

    static void listarOrdenes() {
        String lista = "Órdenes activas:\n";
        for (int i = 0; i < ordenesCount; i++) {
            PedidoBarista ob = ordenes[i];
            if (ob != null && ob.isActiva()) {
                String linea = obtenerNombreEmpleado(ob.getIdEmpleado()) + " - " +
                               obtenerNombreBebida(ob.getIdBebida()) + "\n";
                lista = lista + linea;
            }
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    static void anularOrden() {
        int idEmpleado = pedirIdEmpleado();
        if (idEmpleado == -1) return;

        int pos = buscarOrdenActiva(idEmpleado);
        if (pos == -1) {
            JOptionPane.showMessageDialog(null, "No tiene orden activa");
            return;
        }

        ordenes[pos].setActiva(false);
        JOptionPane.showMessageDialog(null, "Orden anulada");
    }

    public static boolean tieneOrdenActiva(int idEmpleado) {
        return buscarOrdenActiva(idEmpleado) != -1;
    }

    public static int buscarOrdenActiva(int idEmpleado) {
        for (int i = 0; i < ordenesCount; i++) {
            PedidoBarista ob = ordenes[i];
            if (ob != null && ob.isActiva() && ob.getIdEmpleado() == idEmpleado) {
                return i;
            }
        }
        return -1;
    }
    // metodoa
    public static int pedirIdEmpleado() {
        String input = JOptionPane.showInputDialog("Digite el ID del empleado:");
        if (input == null) return -1;          
        int id = Integer.parseInt(input);       

        // Buscar si existe
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] != null && empleados[i].getId() == id) {
                return id;
            }
        }
        JOptionPane.showMessageDialog(null, "Empleado no encontrado");
        return -1;
    }

    public static String obtenerNombreEmpleado(int id) {
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] != null && empleados[i].getId() == id) {
                return empleados[i].getNombre();
            }
        }
        return "Desconocido";
    }

    public static int obtenerIdBebida(String nombre) {
        for (int i = 0; i < bebidas.length; i++) {
            if (bebidas[i] != null && bebidas[i].getNombre().equals(nombre)) {
                return bebidas[i].getId();
            }
        }
        return -1;
    }

    public static String obtenerNombreBebida(int id) {
        for (int i = 0; i < bebidas.length; i++) {
            if (bebidas[i] != null && bebidas[i].getId() == id) {
                return bebidas[i].getNombre();
            }
        }
        return "Desconocida";
    }
    
public static void reservarGym() {
    int idEmpleado = pedirIdEmpleado();
    if (idEmpleado == -1) return;

    String[] horarios = {"2pm","3pm","4pm","5pm","6pm","7pm"};
    String hora = (String) JOptionPane.showInputDialog(
        null,
        "Seleccione hora:",
        "Reserva Gimnasio",
        JOptionPane.QUESTION_MESSAGE,
        null,
        horarios,
        horarios[0]
    );

    if (hora == null) return;

    if (buscarReservaPorHora(hora) != null) {
        JOptionPane.showMessageDialog(null, "Ese horario ya está reservado");
        return;
    }

    reservasGym[reservasGymCount] = new GimnasioReserva(idEmpleado, hora);
    reservasGymCount++;
    JOptionPane.showMessageDialog(null, "Reserva creada para " + obtenerNombreEmpleado(idEmpleado) + " a las " + hora);
}

public static void listarReservasGym() {
    String lista = "Reservas Gimnasio:\n";
    for (int i = 0; i < reservasGymCount; i++) {
        GimnasioReserva r = reservasGym[i];
        if (r != null && r.isActiva()) {
            lista += r.getHora() + " - " + obtenerNombreEmpleado(r.getIdEmpleado()) + "\n";
        }
    }
    JOptionPane.showMessageDialog(null, lista);
}

public static void liberarReservaGym() {
    int idEmpleado = pedirIdEmpleado();
    if (idEmpleado == -1) return;

    for (int i = 0; i < reservasGymCount; i++) {
        GimnasioReserva r = reservasGym[i];
        if (r != null && r.isActiva() && r.getIdEmpleado() == idEmpleado) {
            r.setActiva(false);
            JOptionPane.showMessageDialog(null, "Reserva liberada");
            return;
        }
    }
    JOptionPane.showMessageDialog(null, "No se encontró reserva activa");
}

public static void visualizarGym() {
    String[] horarios = {"2pm","3pm","4pm","5pm","6pm","7pm"};
    String lista = "Estado del Gimnasio:\n";
    for (int i = 0; i < horarios.length; i++) {
        GimnasioReserva r = buscarReservaPorHora(horarios[i]);
        if (r != null && r.isActiva()) {
            lista += horarios[i] + " - Ocupado por " + obtenerNombreEmpleado(r.getIdEmpleado()) + "\n";
        } else {
            lista += horarios[i] + " - Disponible\n";
        }
    }
    JOptionPane.showMessageDialog(null, lista);
}

public static GimnasioReserva buscarReservaPorHora(String hora) {
    for (int i = 0; i < reservasGymCount; i++) {
        GimnasioReserva r = reservasGym[i];
        if (r != null && r.isActiva() && r.getHora().equals(hora)) {
            return r;
        }
    }
    return null;
}

}
