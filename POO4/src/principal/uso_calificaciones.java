package principal;

import javax.swing.JOptionPane;

public class uso_calificaciones {
	public static void main(String[] args) {
	calificaciones alumnos = new calificaciones();

	alumnos.setCurso(JOptionPane.showInputDialog("Nombre del curso: "));
	alumnos.setCalificacion(Integer.parseInt(JOptionPane.showInputDialog("Nota: ")));

	System.out.println("CURSO: "+alumnos.getCurso());
	System.out.println("CATEGORIA DE TU CALIFICACION: "+alumnos.categoria(alumnos.getCalificacion()));
	}
}
