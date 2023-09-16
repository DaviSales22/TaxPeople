package entities;

public class PJ extends Tax{

	private Integer NumeroFuncionario;

	public PJ(String name, Double anualIncome, Integer numeroFuncionario) {
		super(name, anualIncome);
		NumeroFuncionario = numeroFuncionario;
	}

	public Integer getNumeroFuncionario() {
		return NumeroFuncionario;
	}

	public void setNumeroFuncionario(Integer numeroFuncionario) {
		NumeroFuncionario = numeroFuncionario;
	}
	
	
	@Override
	public Double Incometax() {
		if(NumeroFuncionario > 10) {
			return super.getAnualIncome() * 0.14;
		}else {
			return super.getAnualIncome() * 0.16;
		}
	}
	
}
