

public class IceCream extends DessertItem{
	private int price;
	
	public IceCream(String name,int price) {
		super(name);
		this.setPrice(price);
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getCost() {
		return price;
	}
	
	public String toString() {
		return "";
	}
}
