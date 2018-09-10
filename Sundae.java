
public class Sundae extends DessertItem{
	private int price;
	private String nameoftopping;
	private int priceoftopping;
	
	public Sundae(String name,int price,String nameoftopping,int priceoftopping) {
		super(name);
		this.setPrice(price);
		this.setPriceOfTopping(priceoftopping);
		this.setNameOfTopping(nameoftopping);
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getNameOfTopping() {
		return nameoftopping;
	}

	public void setNameOfTopping(String nameoftopping) {
		this.nameoftopping = nameoftopping;
	}

	public int getPriceOfTopping() {
		return priceoftopping;
	}

	public void setPriceOfTopping(int priceoftopping) {
		this.priceoftopping = priceoftopping;
	}

	public int getCost() {
		return price + priceoftopping;
	}
	
	public String toString() {
		return nameoftopping + " Sundae with\n";
	}
}
