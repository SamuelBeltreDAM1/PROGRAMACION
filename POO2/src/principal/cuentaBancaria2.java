package principal;

public class cuentaBancaria2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cuentaBancaria cuenta = new cuentaBancaria();

cuenta.setsaldo(20000.00);
cuenta.settitular("samuel beltre");

System.out.println("titular de la cuenta: "+ cuenta.gettitular());
System.out.println("saldo de la cuenta: "+ cuenta.getsaldo());

	}

}
