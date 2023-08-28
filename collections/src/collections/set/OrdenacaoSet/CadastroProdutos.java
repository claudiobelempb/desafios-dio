package collections.set.OrdenacaoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> produtos;

	public CadastroProdutos() {
		this.produtos = new HashSet<Produto>();
	}

	public void adicionarProduto(Long cod, String nome, double preco, int quantidade) {
		Produto produto = new Produto(cod, nome, preco, quantidade);
		this.produtos.add(produto);
	}

	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtosPorNome = new TreeSet<Produto>(produtos);
		return produtosPorNome;
	}

	public Set<Produto> exibirProdutosPorPreco() {
		Set<Produto> produtosPorPreco = new TreeSet<Produto>(new ComparatorProdutosPorPreco());
		if (!produtos.isEmpty()) {
			produtos.addAll(produtos);
			return produtosPorPreco;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	public static void main(String[] args) {
		// Criando uma instância do CadastroProdutos
		CadastroProdutos cadastroProdutos = new CadastroProdutos();

		// Adicionando produtos ao cadastro
		cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
		cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
		cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
		cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);

		// Exibindo todos os produtos no cadastro
		System.out.println(cadastroProdutos.exibirProdutosPorNome());

		// Exibindo produtos ordenados por nome
		System.out.println(cadastroProdutos.exibirProdutosPorNome());

		// Exibindo produtos ordenados por preço
		System.out.println(cadastroProdutos.exibirProdutosPorPreco());
	}
}
