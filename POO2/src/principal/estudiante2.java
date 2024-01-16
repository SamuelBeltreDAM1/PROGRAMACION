package principal;

public class estudiante2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
estudiante paco = new estudiante();

paco.setnombre(paco.getnombre());
paco.setedad(paco.getedad());
paco.setcalificacion(paco.getcalificacion());

System.out.println("nombre: "+paco.getnombre());
System.out.println("edad: "+paco.getedad());
System.out.println("calificacion: "+paco.getcalificacion());
	}

}
