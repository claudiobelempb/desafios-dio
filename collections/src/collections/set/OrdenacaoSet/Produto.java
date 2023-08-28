package collections.set.OrdenacaoSet;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
	private Long cod;
	private String name;
	private double preco;
	private int quantidade;

	public Produto(Long cod, String name, double preco, int quantidade) {
		super();
		this.cod = cod;
		this.name = name;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Long getCod() {
		return cod;
	}

	public void setCod(Long cod) {
		this.cod = cod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [cod=" + cod + ", name=" + name + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return cod == other.cod;
	}

	@Override
	public int compareTo(Produto p) {
		return name.compareToIgnoreCase(p.getName());
	}

}

class ComparatorProdutosPorPreco implements Comparator<Produto> {
	@Override
	public int compare(Produto p1, Produto p2) {
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
}
