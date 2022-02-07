package guru.springframework;

public class Dollar {
	
	private int amount;
	
	public Dollar(int amount) {
		this.amount = amount;
		
	}
	
	public Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
	
	public boolean equals(Object o) {
		Dollar doller = (Dollar) o;
		return amount == doller.amount;
	}
}
