package principal;

public class cuentaBancaria {

	private String titular;
	private double saldo;
	
public void settitular(String titular) {
	this.titular=titular;
}
public void setsaldo(double saldo) {
	this.saldo=saldo;
}
public String gettitular() {
	return titular;
}
public double getsaldo() {
	return saldo;
}
}
