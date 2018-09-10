

public class Candy extends DessertItem{
	private double weight; 
	private double priceperpound;
	
	public Candy(String name, double weight, double price) {
		super(name);
		this.setPrice(price);
		this.setweight(weight);
	}
	
	public double getweight() {
		return weight;
	}

	public void setweight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return priceperpound;
	}

	public void setPrice(double price) {
		this.priceperpound = price;
	}
	
	public int getCost() {
		if(weight * priceperpound - (int) (weight * priceperpound) < 0.5) {
			return (int) (weight * priceperpound);
		}
		return (int) (weight * priceperpound) + 1;
	}
	
	public String toString() {
		return String.format("%.2f lbs. @ %.2f /lb.\n", weight, priceperpound / 100);
	}
}
