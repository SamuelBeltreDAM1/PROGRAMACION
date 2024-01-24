package principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class uso_inventario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inventario muebles = new inventario();
		Scanner sc = new Scanner(System.in);

		int operador = Integer.parseInt(JOptionPane.showInputDialog("Añadir producto al inventario PULSE 1"));
		if (operador == 1) {
			do {
				muebles.setProducto(
						JOptionPane.showInputDialog("Producto al que añadir en el inventario: "));
				muebles.setCantidad(Integer.parseInt(JOptionPane.showInputDialog("Nº de " + muebles.getProducto() + " que se desean añadir al inventario: ")));
				muebles.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Precio por " + muebles.getProducto() + " : ")));

				JOptionPane.showMessageDialog(null,
						"PRODUCTO NUEVO: " + muebles.getProducto() + "\n" + "Nº DE "
								+ muebles.getProducto().toUpperCase() + " : " + muebles.getCantidad() + "\n"
								+ "PRECIO POR " + muebles.getProducto().toUpperCase() + " : " + muebles.getPrecio());

				operador = Integer.parseInt(JOptionPane
						.showInputDialog("Añadir otro producto al inventario PULSE 1 o cerrar invetario PULSE 2"));
			} while (operador == 1);
		} else  {
			JOptionPane.showMessageDialog(null, "Con este numero no se puede operar");
		}
	}
}
