package principal;

public class hotel {

  
}
 class habitacion{
	private int nhab;
	private String tipo;
	private int oc;
	private int li;
	public habitacion() {
		oc=1;
		li=0;
	}
	
	public void setnhab(int nhab) {
		this.nhab=nhab;
	}
	public int getnhab() {
		return nhab;
	}
	public void settipo(String tipo) {
		this.tipo=tipo;
	}
	public String getttipo() {
		return tipo;
	}
	public void setoc(int oc) {
		this.oc=oc;
	}
	public int getoc() {
		return oc;
	}
	public void setli(int li) {
		this.li=li;
	}
	public int getli() {
		return li;
	}

}
