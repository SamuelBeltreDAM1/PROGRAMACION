package trabajos;

import javax.swing.JOptionPane;

public class temperatura {
private double temp;
private final double constante, ajuste;
public temperatura(double t) {
	temp = t;
	constante = 1.8;
	ajuste = 32;
}
public double getTemp() {
	return temp;
}
public void setTemp(double temp) {
	this.temp = temp;
}
public double getConstante() {
	return constante;
}
public double getAjuste() {
	return ajuste;
}
public double conversor(double temp) {	
	return temp*constante+ajuste;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
double temp =Double.parseDouble(JOptionPane.showInputDialog("introduce la temperatura en celsius: "));
          temperatura madrid = new temperatura(temp);
          
          JOptionPane.showMessageDialog(null, "la temperatura celsius que has introducido es: "+madrid.getTemp()+
        		  "\n convertido a Fahrenheit: "+madrid.conversor(temp));
	}
}
