package myproducts;

public class Product {
	protected String name;
	protected int price;
	protected int vatRate;

	public void setDatas(String name, int price, int vatRate) {
		this.name = name;
		this.price = price;
		this.vatRate = vatRate;
	}

	public int getBrutto() {
		return price + ((price * vatRate)/100);
	}

	@Override
	public String toString() {
		return "Name:" + name + "Price of brutto:" + getBrutto();
	}

	public void nettoNoveles(int percentage) {
		price = price + ((price * percentage)/100);
	}

	public int compareBetweenBruttos(Product b) {
		if (getBrutto() > b.getBrutto())
			return 1;
		if (getBrutto() < b.getBrutto())
			return -1;
		return 0;
	}
}
