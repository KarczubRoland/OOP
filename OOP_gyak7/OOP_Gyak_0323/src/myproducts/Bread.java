package myproducts;

public class Bread extends Product {
	private double quantity;

	public void setDatasFour(String name, int price, int vatRate, double quantity) {
		this.name = name;
		this.price = price;
		this.vatRate = vatRate;
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return getBrutto() / quantity;
	}
	@Override
	public String toString() {
		return "Name:" + name + "Price of brutto:" + getBrutto() + " Unit price:" + getUnitPrice();
	}

	public double getQuantity() {
		return quantity;
	}

	public static boolean compareBetweenTwoBreads(Bread a, Bread b) {
		if (a.getUnitPrice() > b.getUnitPrice())
			return true;
		return false;
	}
}
