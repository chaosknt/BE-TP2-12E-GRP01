package ar.edu.ort.tp2.ej04;

public class Departamento {
	private String piso;
	private String dpto;
	
	public Departamento(String altura, String dpto) {
		this.piso = altura;
		this.dpto = dpto;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String altura) {
		this.piso = altura;
	}

	public String getDpto() {
		return dpto;
	}

	public void setDpto(String dpto) {
		this.dpto = dpto;
	}

	@Override
	public String toString() {
		return "Departamento [piso=" + piso + ", dpto=" + dpto + "]";
	}
	
	
}
