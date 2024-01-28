package principal;

import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class uso_empleado1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
empleado1 datos = new empleado1();
datos.setNombre(JOptionPane.showInputDialog("nombre del empleado"));
datos.setSueldo(Double.parseDouble(JOptionPane.showInputDialog("sueldo del empleado")));
datos.setAño(Integer.parseInt(JOptionPane.showInputDialog("Año de inicio de contrato")));
datos.setMes(Integer.parseInt(JOptionPane.showInputDialog("Mes de inicio de contrato")));
datos.setDia(Integer.parseInt(JOptionPane.showInputDialog("Dia de inicio de contrato")));

GregorianCalendar calendario = new GregorianCalendar();
calendario.set(datos.getAño(), datos.getMes(), datos.getDia());

JOptionPane.showMessageDialog(null,datos.getNombre()+"\n"+datos.getSueldo()+"\n"+calendario.getTime());

	}

}
