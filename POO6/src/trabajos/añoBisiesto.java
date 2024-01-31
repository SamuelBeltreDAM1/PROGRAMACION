package trabajos;

import javax.swing.JOptionPane;

public class añoBisiesto {

	private final int const1;
	private final int const2;
	private final int const3;
	private int año;
	
	public añoBisiesto() {
		const1 = 4;
		const2 = 100;
		const3 = 400;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public int getConst1() {
		return const1;
	}
	public int getConst2() {
		return const2;
	}
	public int getConst3() {
		return const3;
	}
	public static String año (int año) {
		String frase;
	    if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
	    	frase = "El año "+año+" es bisiesto";
	    }else {
	    	frase = "El año "+año+" no es bisiesto";
	    }
	    return frase;
	}
	public static void main(String[] args) {
		
		añoBisiesto calcu = new añoBisiesto();
	calcu.setAño(Integer.parseInt(JOptionPane.showInputDialog("introduce el año: ")));
    String frase = año(calcu.getAño());
    JOptionPane.showMessageDialog(null, frase);
	}
}
