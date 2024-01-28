package principal;

import javax.swing.JOptionPane;

public class uso_empleado2 {

	public static void main(String[] args) {
		empleado2 datos = new empleado2();
		JOptionPane.showInputDialog("nombre del empleado");
datos.setSueldo(Double.parseDouble(JOptionPane.showInputDialog("sueldo del empleado")));
subeSueldo(datos.getSueldo());
	}
	public static void subeSueldo(double sueldo) {
		double aumento = sueldo* 1.10;
	    JOptionPane.showMessageDialog(null, "Este es tu aumento de sueldo incrementado un 10%: "+aumento);
	}
}
