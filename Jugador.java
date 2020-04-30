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
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido; 
	}

	public GregorianCalendar getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento; 
	}

	public String toString() {
		return this.apellido + " - " + this.fechaNacimiento;
	}
}	