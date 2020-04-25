package data;

public class Estudiante extends Persona {
	
	private long Codigo;
	private String Programa;
	private String Fecha_Ingreso;
	

	public Estudiante(long codigo, String programa, String fecha_Ingreso) {
		super();
		this.Codigo = codigo;
		this.Programa = programa;
		this.Fecha_Ingreso = fecha_Ingreso;		
		
	}

	public Estudiante() {}
	
	public long getCodigo() {
		return Codigo;
	}

	public void setCodigo(long codigo) {
		Codigo = codigo;
	}

	public String getPrograma() {
		return Programa;
	}

	public void setPrograma(String programa) {
		Programa = programa;
	}

	public String getFecha_Ingreso() {
		return Fecha_Ingreso;
	}

	public void setFecha_Ingreso(String fecha_Ingreso) {
		Fecha_Ingreso = fecha_Ingreso;
	}

	@Override
	public String toString() {
		return "Estudiante [Codigo=" + Codigo + ", Programa=" + Programa + ", Fecha_Ingreso=" + Fecha_Ingreso + "]";
	}
	
	
}
