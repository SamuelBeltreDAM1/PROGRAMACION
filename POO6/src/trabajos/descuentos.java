package trabajos;

import javax.swing.JOptionPane;

public class descuentos {
	private double precio;
	private int cantidad;
	private final double descuento;

	public descuentos(double pre, int cant) {
		precio = pre;
		cantidad = cant;
		descuento = 0.90;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getDescuento() {
		return descuento;
	}

	public static double precioTotal(double precio, int cantidad, double descuento) {
		double precioT = precio * cantidad;
		return precioT;
	}

	public static double descontar(double precioTotal, int cantidad, double descuento) {
		double precioDesc;
		if (cantidad >= 5) {
			precioDesc = precioTotal * descuento;
		} else {
			precioDesc = precioTotal;
		}
		return precioDesc;
	}

	public static void main(String[] args) {
		double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de tu producto: "));
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Nº de productos que compras: "));
		descuentos cliente = new descuentos(precio, cantidad);
	
		double precioTotal = precioTotal(precio, cantidad, cliente.getDescuento());
		double precioDescuento = descontar(precioTotal, cantidad, cliente.getDescuento());
		
		JOptionPane.showMessageDialog(null, "Precio total: " + precioTotal + "€");
		JOptionPane.showMessageDialog(null, "Precio con descuento: " + precioDescuento + "€");

	}
}
