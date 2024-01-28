package principal;

public class contactos {
	private String[] nombre;
	private int[] tel;
	private String[] email;
	public contactos() {
		nombre = new String [3];
		email = new String [3];
		tel = new int [3];
		
		nombre[0]="Claudio";
		nombre[1]="Bea";
		nombre[2]="Carlos";
		
		email[0]="claudio@gmail.com";
		email[1]="bea@gmail.com";
		email[2]="carlos@gmail.com";
		
		tel[0]=123456789;
		tel[1]=987654321;
		tel[2]=135798642;

	}
	public String[] getNombre() {
		return nombre;
	}
	public void setNombre(String[] nombre) {
		this.nombre = nombre;
	}
	public int[] getTel() {
		return tel;
	}
	public void setTel(int[] tel) {
		this.tel = tel;
	}
	public String[] getEmail() {
		return email;
	}
	public void setEmail(String[] email) {
		this.email = email;
	}

}
