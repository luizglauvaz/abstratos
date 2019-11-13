package entities;

public class PessoaJuridica extends Contribuintes {
	
	private int numFunc;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, double rendaAnual, int numFunc) {
		super(nome, rendaAnual);
		this.numFunc = numFunc;
	}

	public int getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(int numFunc) {
		this.numFunc = numFunc;
	}

	@Override
	public double impostoArrecadado() {
		double imposto = 0;
		if (numFunc <= 10) {
			imposto = getRendaAnual() * 0.16;
		}
		else {
			imposto = getRendaAnual() * 0.14;
		}
		return imposto;
	}

	
	
}
