package principal;

import java.util.Date;

public class empleado3 {
	private String nombre;
    private Date fechaContrato;

    public empleado3(String nombre, Date fechaContrato) {
        this.nombre = nombre;
        this.fechaContrato = fechaContrato;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public String getNombre() {
        return nombre;
    }
}

