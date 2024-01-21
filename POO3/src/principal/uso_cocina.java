package principal;

import java.util.Scanner;

public class uso_cocina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
tortilla();
	}

	public static void tortilla() {
		cocina nueva = new cocina();
		String[] ingre = new String[nueva.getin()];
		String[] pasos = new String[nueva.getpa()];
		System.out.println("           RECETA PARA HACER UNA TORTILLA DE PATATAS");
		System.out.println();
		System.out.println("INGREDIENTES: ");
		for (int i = 0; i < ingre.length; i++) {
			ingre[0] = "patatas";
			ingre[1] = "huveos";
			ingre[2] = "cebolla";
			ingre[3] = "sal";
			ingre[4] = "aceite";
			System.out.println(ingre[i]);
		}
		System.out.println();
		System.out.println("PASOS: ");
		for (int i = 0; i < ingre.length; i++) {
			pasos[0] = "calentar el aceite";
			pasos[1] = "freir patatas";
			pasos[2] = "freir cebolla";
			pasos[3] = "añadir sal";
			pasos[4] = "añadir el huevo batido";
			System.out.println(pasos[i]);
		}
		Scanner sc =new Scanner(System.in);
		System.out.println();
		System.out.print("te gustaria modificar(PULSE-1) algun ingrediente o modificar algun paso (PULSE-2): ");
		int opcion = sc.nextInt();
		if (opcion==1) {
			modIngrediente(ingre); 
		}
	}
	public static void modIngrediente(String[] ingre) {
		cocina nueva = new cocina();
		Scanner sc =new Scanner(System.in);
		System.out.print("añadir(PULSE-1) o quitar(PULSE-2): ");
		int opcion=sc.nextInt();
		if (opcion ==1) {
			for (int i = 0; i < ingre.length; i++) {

			}
		}
	}
}
