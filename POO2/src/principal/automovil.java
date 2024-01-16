package principal;

public class automovil {
	private String marca;
	private String modelo;

	public automovil() {
		marca = "Seat";
		modelo = "leon";
	}
//METODOS GETTER
	public String getmarca() {
		return marca;
	}

	public String getmodelo() {
		return modelo;
	}
//METODOS SETTER
	public void setmarca(String marca) {
		this.marca = marca;
	}

	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}

