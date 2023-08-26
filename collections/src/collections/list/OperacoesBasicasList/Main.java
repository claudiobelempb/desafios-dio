package collections.list.OperacoesBasicasList;

public class Main {

	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

		carrinho.adicionarItem("Lápis", 2d, 3);
		carrinho.adicionarItem("Lápis", 2d, 3);
		carrinho.adicionarItem("Caderno", 35d, 1);
		carrinho.adicionarItem("Borracha", 2d, 2);

		// Calculando e exibindo o valor total da compra
		carrinho.removerItem("Lápis");

		carrinho.exibirItens();
		System.out.println("O valor total da compra é = " + carrinho.calcularValorTotal());
		System.out.println("Total itens: " + carrinho.obterNumeroTotalItems());

	}

}
