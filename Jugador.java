import java.util.GregorianCalendar;

public class Jugador {

	private String apellido;
	private GregorianCalendar fechaNacimiento;
	
	public Jugador() {
	}
	
	public Jugador(String apellido, GregorianCalendar fechaNacimiento) {
		this.setApellido(apellido);
		this.setFechaNacimiento(fechaNacimiento);
	}
	
	String getApellido() {
		return this.apellido;
	}
	
	void setApellido(String apellido) {
		this.apellido = apellido; 
	}

	GregorianCalendar getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento; 
	}

	String toString() {
		return this.apellido + " - " + this.fechaNacimiento;
	}
}	