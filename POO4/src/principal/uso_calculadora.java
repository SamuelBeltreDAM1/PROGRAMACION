package principal;

import javax.swing.JOptionPane;

public class uso_calculadora {
	public static void main(String[] args) {
		calculadora sueldo = new calculadora();
		int empleado = 1;
		do {
			sueldo.setNombre(JOptionPane.showInputDialog("NOMBRE DEL EMPLEADO " + empleado));
			sueldo.setHorasT(Integer.parseInt(JOptionPane.showInputDialog("HORAS DEL EMPLEADO " + empleado)));
			sueldo.setTarifa(Integer.parseInt(JOptionPane.showInputDialog("TARIFA DEL EMPLEDO " + empleado)));
			System.out.println("NOMBRE: " + sueldo.getNombre());
			System.out.println("HORAS: " + sueldo.getHorasT());
			System.out.println("TARIFA: " + sueldo.getTarifa());
			 sueldo.setSalario(sueldo.getTarifa() * sueldo.getHorasT());
			System.out.println("SUELDO: "+ sueldo.getSalario() );
			empleado++;
			System.out.println();
		} while (empleado < 6);
	}
}
