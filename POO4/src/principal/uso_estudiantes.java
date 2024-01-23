package principal;

import javax.swing.JOptionPane;

public class uso_estudiantes {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			estudiantes alumno = new estudiantes();
			int alumnos = 1;
			do {
				System.out.println("ALUMNO " + alumnos);
				alumno.setnombre(JOptionPane.showInputDialog("nombre del alumno " + alumnos + ": "));
				alumno.setedad(JOptionPane.showInputDialog("edad del alumno" + alumnos + ": "));
				alumno.setgrado(JOptionPane.showInputDialog("grado del alumno" + alumnos + ": "));
				System.out.println("NOMBRE: " + alumno.getnombre());
				System.out.println("EDAD: " + alumno.getedad());
				System.out.println("GRADO: " + alumno.getgrado());
				System.out.println();
				alumnos++;
				
			} while (alumnos < 4);
		}
	}

