package data;

public class Empleado extends Persona {

	private String Cargo;
	private String Fecha_Ingreso;
	private long Salario;
	
	public Empleado(String cargo, String fecha_Ingreso, long salario) {
		super();
		this.Cargo = cargo;
		this.Fecha_Ingreso = fecha_Ingreso;
		this.Salario = salario;

		
		
}

	public Empleado(){}
	
	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public String getFecha_Ingreso() {
		return Fecha_Ingreso;
	}

	public void setFecha_Ingreso(String fecha_Ingreso) {
		Fecha_Ingreso = fecha_Ingreso;
	}

	public long getSalario() {
		return Salario;
	}

	public void setSalario(long salario) {
		Salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [Cargo=" + Cargo + ", Fecha_Ingreso=" + Fecha_Ingreso + ", Salario=" + Salario + "]";
	}
	
	
	
}