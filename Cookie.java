
public class Cookie extends DessertItem{
	private double number; 
	private double priceperdozen;
	
	public Cookie(String name, double number, double price) {
		super(name);
		this.setPrice(price);
		this.setNumber(number);
	}
	
	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public double getPrice() {
		return priceperdozen;
	}

	public void setPrice(double price) {
		this.priceperdozen = price;
	}
	
	public int getCost() {
		if(number * priceperdozen / 12 - (int) (number * priceperdozen) / 12 < 0.5) {
			return (int) (number * priceperdozen / 12);
		}
		return (int) (number * priceperdozen / 12) + 1;
	}
	
	public String toString() {
		return String.format("%.2f lbs. @ %.2f /lb.\n", number, priceperdozen / 100);
	}
}
