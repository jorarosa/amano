import java.util.GregorianCalendar;

public abstract class Jugador {

	private String apellido;
	private GregorianCalendar fechaNacimiento;
	private EnumPosicion posicion;
	
	public Jugador() {
	}
	
	public Jugador(String apellido, GregorianCalendar fechaNacimiento, EnumPosicion posicion) {
		this.setApellido(apellido);
		this.setFechaNacimiento(fechaNacimiento);
		this.setPosicion(posicion);
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

	public abstract EnumPosicion getPosicion();
		
	public abstract void setPosicion(EnumPosicion posicion); 
		
	public String toString() {
		return this.apellido + " - " + this.fechaNacimiento;
	}
}