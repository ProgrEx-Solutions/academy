package herencia;

import java.util.Objects;

public class Empleado extends Persona{
	
	private String codEmpleado;
	
	private double sueldo;

	public Empleado() { }

	public Empleado(Persona p, String codEmpleado, double sueldo) {
		super(p.getNombre(), p.getEdad());
		this.codEmpleado = codEmpleado;
		this.sueldo = sueldo;
	}
	
	public Empleado(String codEmpleado, double sueldo) {
		super();
		this.codEmpleado = codEmpleado;
		this.sueldo = sueldo;
	}

	public Empleado(String nombre, int edad, String codEmpleado, double sueldo) {
		super(nombre, edad);
		this.codEmpleado = codEmpleado;
		this.sueldo = sueldo;
	}

	public String getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + getNombre() + ", edad=" + getEdad() + 
				", codEmpleado=" + codEmpleado + ", sueldo=" + sueldo + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(codEmpleado, other.codEmpleado)
				&& Double.doubleToLongBits(sueldo) == Double.doubleToLongBits(other.sueldo);
	}

	

}
