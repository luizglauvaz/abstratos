package entities;

public class PessoaFisica extends Contribuintes {

	private double gastoSaude;
	
	public PessoaFisica() {
		super();
	}
		
	public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double impostoArrecadado() {
		double imposto = 0;
		if (getRendaAnual() < 20000.00) {
			imposto = getRendaAnual() * 0.15 - gastoSaude * 0.5;
		}
		else {
			imposto = getRendaAnual() * 0.25 - gastoSaude * 0.5;
		}
		return imposto;
	}

	
}
