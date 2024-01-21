package principal;

import java.util.Scanner;

public class usoHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		habitacion urbano = new habitacion();
		int [] hab = new int[101];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i < hab.length; i++) {
			hab[i] = urbano.getli();
			if (i % 10 == 0) {
				System.out.println(hab[i]);
			} else {
				System.out.print(hab[i] + " ");
			}
		}
		System.out.println();		
		inicio(hab);
	}
	public static void inicio(int [] hab) {		
		habitacion urbano = new habitacion();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 1; i++) {
			System.out.println(" QUE NUMERO DE HABITACION TE GUSTARIA RESERVAR: ");
			urbano.setnhab(sc.nextInt());
			if (urbano.getnhab() >= 1 && urbano.getnhab() < 100) {
				hab(urbano.getnhab());
			} else {
				System.out.println("este numero de habitacion no existe");
			}
		}
	}
	
	public static void inicio2(int[] habitaciones) {
System.out.println();
System.out.println();

System.out.println(habitaciones);
	}

	public static void hab(int a) {
		habitacion urbano = new habitacion();
		int[] habitaciones = new int[101];
		System.out.println("habitacion alquilada con exito");
		for (int i = 1; i < habitaciones.length; i++) {
			habitaciones[a] = urbano.getoc();
			if (i % 10 == 0) {
				System.out.println(habitaciones[i]+" ");
			} else {
				System.out.print(habitaciones[i] + " ");
			}
		}
		for (int i = 0; i < 1; i++) {
			inicio2(habitaciones);
		}
	}
}
