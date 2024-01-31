package trabajos;

import javax.swing.JOptionPane;

public class calculadora {

private final double impuesto;
private double precio;
    public calculadora(double prec) {
    	impuesto = 1.15;
    	precio=prec;
    }

public double getImpuesto() {
	return impuesto;

}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}

public static void main(String[] args) {
	
	double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto: "));
    calculadora calcu = new calculadora(precio);
	
	JOptionPane.showMessageDialog(null, "el precio que has introducido es: "+calcu.getPrecio()+
			"\n tu precio añadido el impuesto es: "+ precioFinal(precio));
	
}
public static double precioFinal (double precio) {
	calculadora calcu = new calculadora(precio);
	double precioF = precio*calcu.getImpuesto();
	return precioF;
}
}
