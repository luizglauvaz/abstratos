package entities;

public abstract class Contribuintes {

	private String nome;
	private double rendaAnual;
	
	public Contribuintes() {
	}

	public Contribuintes(String nome, double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String name) {
		this.nome = name;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract double impostoArrecadado();
	
}
