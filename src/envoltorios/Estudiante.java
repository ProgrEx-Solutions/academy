package envoltorios;

import java.util.Objects;

public class Estudiante extends Persona {
	
	private String matricula;
	
	private Double notaMedia;

	public Estudiante() {}
	
	public Estudiante(String matricula, Double notaMedia) {
		super();
		this.matricula = matricula;
		this.notaMedia = notaMedia;
	}

	public Estudiante(Persona p, String matricula, Double notaMedia) {
		super(p.getNombre(), p.getEdad());
		this.matricula = matricula;
		this.notaMedia = notaMedia;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(Double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Estudiante [matricula=" + matricula + ", notaMedia=" + notaMedia + ", getNombre()=" + getNombre()
				+ ", getEdad()=" + getEdad() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return Objects.equals(matricula, other.matricula) && Objects.equals(notaMedia, other.notaMedia);
	}
	
	public int compareTo(Estudiante e) {
		if(this.notaMedia > e.notaMedia) {
			return 1;
		} else if(this.notaMedia < e.notaMedia) {
			return -1;
		} else {
			return 0; 
		}
	}
}
