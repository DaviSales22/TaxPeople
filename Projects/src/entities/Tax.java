package entities;

public abstract class Tax {
	private String Name;
	private Double AnualIncome;
	
	public Tax(String name, Double anualIncome) {
		super();
		Name = name;
		AnualIncome = anualIncome;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getAnualIncome() {
		return AnualIncome;
	}
	public void setAnualIncome(Double anualIncome) {
		AnualIncome = anualIncome;
	}
	
	public abstract Double Incometax();
}
