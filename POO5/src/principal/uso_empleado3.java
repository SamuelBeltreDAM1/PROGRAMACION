package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class uso_empleado3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Crear empleado 1
        System.out.println("Ingrese la información del Empleado 1:");
        System.out.print("Nombre: ");
        String nombreEmpleado1 = sc.nextLine();
        System.out.print("Fecha de contrato (formato dd/MM/yyyy): ");
        Date fechaContratoEmpleado1 = obtenerFecha();

        empleado3 empleado1 = new empleado3(nombreEmpleado1, fechaContratoEmpleado1);

        // Crear empleado 2
        System.out.println("\nIngrese la información del Empleado 2:");
        System.out.print("Nombre: ");
        String nombreEmpleado2 = sc.nextLine();
        System.out.print("Fecha de contrato (formato dd/MM/yyyy): ");
        Date fechaContratoEmpleado2 = obtenerFecha();

        empleado3 empleado2 = new empleado3(nombreEmpleado2, fechaContratoEmpleado2);

        // Comparar fechas de contrato
        if (empleado1.getFechaContrato().before(empleado2.getFechaContrato())) {
            System.out.println("\nEl empleado " + empleado1.getNombre() + " fue contratado primero.");
        } else if (empleado2.getFechaContrato().before(empleado1.getFechaContrato())) {
            System.out.println("\nEl empleado " + empleado2.getNombre() + " fue contratado primero.");
        } else {
            System.out.println("\nAmbos empleados fueron contratados en la misma fecha.");
        }
    }

    private static Date obtenerFecha() {
    	Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        Date fecha = null;
        boolean entradaInvalida = true;

        while (entradaInvalida) {
            try {                
                fecha = dateFormat.parse(sc.nextLine());
                entradaInvalida = false;
            } catch (ParseException e) {
                System.out.print("Formato de fecha incorrecto. Ingrese la fecha nuevamente (formato dd/MM/yyyy): ");
            }
        }

        return fecha;
    }
}
