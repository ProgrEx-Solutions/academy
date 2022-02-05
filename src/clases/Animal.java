package clases;

import java.util.Objects;

public class Animal {

	private String tipo;
	
	private int edad;
	
	private int numPatas;
	
	private String color;
	
	public Animal(String tipo, int edad, int numPatas, String color) {
		super();
		this.tipo = tipo;
		this.edad = edad;
		this.numPatas = numPatas;
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "tipo: " + tipo 
				+ "\nedad: " + edad 
				+ "\nnumPatas: " + numPatas 
				+ "\ncolor: " + color;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(color, other.color) && edad == other.edad && numPatas == other.numPatas
				&& Objects.equals(tipo, other.tipo);
	}
	
}
