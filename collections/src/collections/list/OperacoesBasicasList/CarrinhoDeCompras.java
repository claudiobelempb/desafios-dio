package collections.list.OperacoesBasicasList;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> itemList;

	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}

	public void adicionarItem(String name, double price, int quantity) {
		Item item = new Item(name, price, quantity);
		itemList.add(item);
	}

	public void removerItem(String name) {
		List<Item> removerItems = new ArrayList<>();
		if (!itemList.isEmpty()) {
			for (Item i : itemList) {
				if (i.getName().equalsIgnoreCase(name)) {
					removerItems.add(i);
				}
			}
			itemList.removeAll(removerItems);
		} else {
			System.out.println("A lista está vazia!");
		}
	}

	public double calcularValorTotal() {
		double valorTotal = 0d;
		if (!itemList.isEmpty()) {
			for (Item item : itemList) {
				double valorItem = item.getPrice() * item.getQuantity();
				valorTotal += valorItem; // valorTotal = valorTotal + valorItem;
			}
			return valorTotal;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	public int obterNumeroTotalItems() {
		return itemList.size();
	}

	public void exibirItens() {
		if (!itemList.isEmpty()) {
			System.out.println(this.itemList);
		} else {
			System.out.println("A lista está vazia!");
		}
	}

	@Override
	public String toString() {
		return "CarrinhoDeCompras [itemList=" + itemList + "]";
	}
	

}
