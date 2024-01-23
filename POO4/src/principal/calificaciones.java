package principal;

public class calificaciones {
	String curso;
	int calificacion;
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
        this.calificacion=calificacion;
	}
	public String categoria(int calificacion) {
		   switch(calificacion) {
		   case 10,9:
			   return "A";
		   case 8,7: 
			   return "B";
		   case 6:
			   return "C";
		   case 5:
			   return "D";
		   case 0,1,2,3,4:
			   return "F";
		   default:
			   return "nota no valida";
		   }
	}
}
