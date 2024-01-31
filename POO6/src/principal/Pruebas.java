package principal;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empleados trabajador1 = new empleados("loli");
		empleados trabajador2 = new empleados("indalecio");
		
		trabajador1.setSeccion("Recursos Humanos");
		
	System.out.println(trabajador1.devuelveDatos());
	System.out.println(trabajador2.devuelveDatos());
	}
}

class empleados {
	private String nombre;
	private String seccion;

	public empleados(String nom) {
		nombre = nom;
		seccion = "Administracion";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSeccion() {
		return seccion;

	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public String devuelveDatos() {
		return "el nombre es "+nombre+"y la seccion es "+seccion;
	}

}