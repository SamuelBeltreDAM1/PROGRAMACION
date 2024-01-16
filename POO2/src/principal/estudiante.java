package principal;

public class estudiante {

	private String nombre;
	private int edad;
	private double calificacion;

	 public estudiante(){
		 nombre = "paco";
		 edad = 20;
		 calificacion = 5.65;
	 }
	public void setnombre(String nombre) {
		this.nombre=nombre;
	}
	public void setedad(int edad) {
		this.edad=edad;
	}
	public void setcalificacion(double calificacion) {
		this.calificacion=calificacion;
	}
	public String getnombre() {
		return nombre;
	}
	public int getedad() {
		return edad;
	}
	public double getcalificacion(){
		return calificacion;
	}
}
