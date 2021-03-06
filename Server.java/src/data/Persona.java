package data;

import java.io.Serializable;

public class Persona implements Serializable{
	
	private int identificacion;
	private String nombre;
	private String edad;
	private String sexo;
	
	
	public Persona(int identificacion, String nombre, String edad, String sexo) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		
		
	}
	
	public Persona() {}
	
	
	
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Persona [identificacion=" + identificacion + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo
				+ "]";
	}
	
	

}
