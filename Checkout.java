
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Checkout {
	DessertItem[] di;
	private int size;
	
	public Checkout() {
		di = new DessertItem[100];
		size = 0;
	}
	
	public void enterItem(DessertItem m) {
		di[size] = m;
		size += 1;
	}
	
	public int numberOfItems() {
		return size;
	}
	
	public double CostBeforeTax() {
		double t = 0;
		for(int i = 0; i < size; i++) {
			t += di[i].getCost();
		}
		return t / 100;
	}
	
	public double totalCost() {
		BigDecimal bd = new BigDecimal(this.totalTax() + this.CostBeforeTax());
	    bd = bd.setScale(2, RoundingMode.HALF_DOWN);
		return bd.doubleValue();
	}
	
	public double totalTax() {
		BigDecimal bd = new BigDecimal(CostBeforeTax() * DessertShoppe.TAX_RATE / 100);
	    bd = bd.setScale(2, RoundingMode.HALF_DOWN);
	    return bd.doubleValue();
	}
	
	public void clear() {
		di = new DessertItem[100];
		size = 0;
	}
	
	public String toString() {
		String s = "     M & M Dessert Shoppe     \n";
		s += "     --------------------     \n\n";
		for (int i = 0; i < size; i++) {
			s += String.format(di[i].toString());
			s += String.format("%1$-22s %2$10s\n", di[i].name, DessertShoppe.cents2dollarsAndCents(di[i].getCost()));
		}
		
		s += String.format("\n%1$-22s %2$10s\n", "Tax", this.totalTax());
		s += String.format("%1$-22s %2$10s", "Total Cost", this.totalCost());
		
		return s;
	}
}