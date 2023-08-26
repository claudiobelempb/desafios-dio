package collections.list.OperacoesBasicasList;

public class Item {
	private String name;
	private Double price;
	private int quantity;

	public Item(String name, Double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
	return "price=" + price + ", quantity=" + quantity + "]";
	}

}
