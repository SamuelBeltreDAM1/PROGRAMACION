package principal;

import javax.swing.JOptionPane;

public class uso_contactos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre=null;
		String email=null;
		int tel=0;
		inicio(nombre,email,tel);
	}
	public static void inicio(String nombre,String email,int tel) {
		int op = Integer.parseInt(JOptionPane
				.showInputDialog("PULSE 1 (añadir contactos)\nPULSE 2 (mostrar contacto)\nPULSE 3 (buscar contacto)"));
		switch (op) {
		case 1:
			añadir();
			return;
		case 2:
			mostrar(nombre,email,tel);
		case 3: 
			
		default:
			JOptionPane.showMessageDialog(null, "Unexpected value: " + op);
		}
	}
	public static void añadir() {
		String nombre = JOptionPane.showInputDialog("nombre del contacto");
		String email = JOptionPane.showInputDialog("email del contacto");
		int tel = Integer.parseInt(JOptionPane.showInputDialog("Nº telefonico del contacto"));
			mostrar(nombre,email,tel);
	}	
	public static void mostrar(String nombre,String email,int tel) {
	  
	contactos agenda = new contactos();
	agenda.setNombre(null);
	JOptionPane.showMessageDialog(null, nombre+"\n"+email+"\n"+tel);
	inicio(nombre,email,tel);
	}
	public static void buscar(String nombre,String email,int tel) {
	}
}
