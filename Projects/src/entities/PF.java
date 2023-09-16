package entities;

public class PF extends Tax {
	private double gastosSaude;

	public PF(String name, Double anualIncome, double gastosSaude) {
		super(name, anualIncome);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double Incometax() {
		if(getAnualIncome() < 20000.0) {
			setAnualIncome(getAnualIncome() * 0.15 - gastosSaude * 0.5);
		} else {
			if(super.getAnualIncome() > 20000.0) {
				setAnualIncome(getAnualIncome() * 0.25 - gastosSaude * 0.5);
			}
		}
		return getAnualIncome();
	}
	
	
}
