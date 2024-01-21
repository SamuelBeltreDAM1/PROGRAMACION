package principal;

import java.util.Scanner;

public class usoRelojAlarma {

	public static void main(String[] args) {
		operacion2(0);
	}

	public static void operacion2(int operacion) {
		relojAlarma rel = new relojAlarma();
		Scanner sc = new Scanner(System.in);
		rel.sethoraAc(19);
		rel.setminAc(30);
		rel.sethoraAl(20);
		rel.setminAl(15);
		rel.setmodoReloj(true);
		String d = "desactivada";
		String a = "activada";
		while (operacion == 1 || operacion == 2 || operacion == 3 || operacion != 1 || operacion != 2
				|| operacion != 3) {
			System.out.println("HORA ACTUAL: " + rel.gethoraAc() + ":" + rel.getminAc());
			System.out.println("HORA DE LA ALARMA: " + rel.gethoraAl() + ":" + rel.getminAl());
			System.out.println();
			System.out.print(
					"(desactivar/activar la alarma PULSE-1) / (cambiar la alarma PULSE-2) / (cambiar la hora PULSE-3) / (apagar reloj PULSE-4): ");
			operacion = sc.nextInt();

			if (operacion == 1) {
				if (rel.getmodoReloj() == true) {
					rel.setmodoReloj(false);
					System.out.println(d);
				} else {
					rel.setmodoReloj(true);
					System.out.println(a);
				}
			} else if (operacion == 2) {
				System.out.print("NUEVA HORA DE ALARMA: ");
			    rel.sethoraAl(sc.nextInt());
				System.out.print("NUEVO MINUTO DE ALARMA: ");
				rel.setminAl(sc.nextInt());
				if((rel.gethoraAl()>24||rel.gethoraAl()<00)||(rel.getminAl()>24||rel.getminAl()<00)) {
					 System.out.println("la hora o el minuto es invalido");
					 operacion2(0);
				}else {
				System.out.println("alarma actualizada");
				}
				
			} else if (operacion == 3) {
				System.out.print("NUEVA HORA: ");
				rel.sethoraAc(sc.nextInt());
				System.out.print("NUEVO MINUTO: ");
				rel.setminAc(sc.nextInt());
				System.out.println("hora actualizada");
			} else if (operacion == 4) {
				break;
			} else {
				System.out.println("Con este numero no se puede operar");
			}
		}
	}

}