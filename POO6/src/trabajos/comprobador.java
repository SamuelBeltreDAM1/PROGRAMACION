package trabajos;

import javax.swing.JOptionPane;

public class comprobador {
private int edad;
private final int minEdad;
public comprobador(int e) {
	edad=e;
	minEdad=18;
}
	public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public int getMinEdad() {
	return minEdad;
}
public String comprobar( int edad, int minEdad) {
	String frase;
	if (edad<minEdad) {
		 frase = "no eres mayor de edad, puedes votar";
	}else if (edad>minEdad) {
		frase = "eres mayor de edad, no puedes votar";
	}else {
		frase = "eres mayor de edad, puedes votar";
	}
	return frase;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));
comprobador edades = new comprobador(edad);
JOptionPane.showMessageDialog(null, edades.comprobar(edad, edades.getMinEdad()));
	}

}
