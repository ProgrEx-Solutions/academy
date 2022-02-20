package envoltorios;

public class Equipo {
	
	private String nombre;
	
	private int puntos;
	
	private int golesMarcados;

	private int golesEnContra;
	
	private int diferenciaGoles;

	public Equipo() { }

	public Equipo(String nombre, int puntos, int golesMarcados, int golesEnContra) {
		super();
		this.nombre = nombre;
		this.puntos = puntos;
		this.golesMarcados = golesMarcados;
		this.golesEnContra = golesEnContra;
		this.diferenciaGoles = golesMarcados - golesEnContra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(int golesMarcados) {
		this.golesMarcados = golesMarcados;
	}

	public int getGolesEnContra() {
		return golesEnContra;
	}

	public void setGolesEnContra(int golesEnContra) {
		this.golesEnContra = golesEnContra;
	}

	public int getDiferenciaGoles() {
		return diferenciaGoles;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", puntos=" + puntos + ", golesMarcados=" + golesMarcados
				+ ", golesEnContra=" + golesEnContra + ", diferenciaGoles=" + diferenciaGoles + "]";
	}

}
