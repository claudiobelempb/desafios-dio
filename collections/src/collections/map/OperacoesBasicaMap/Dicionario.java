package collections.map.OperacoesBasicaMap;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	private Map<String, String> palavras;

	public Dicionario() {
		palavras = new HashMap<String, String>();
	}

	public void adicionarPalavra(String palavra, String definicao) {
		this.palavras.put(palavra, definicao);
	}

	public void removerPalavra(String palavra) {
		if (!palavras.isEmpty()) {
			palavras.remove(palavra);
		} else {
			System.out.println("Palava não encontrada!");
		}
	}

	public void exibirPalavras() {
		System.out.println(palavras);
	}

	public String pesquisarPorPalavra(String palavra) {
		String pesquisarPorPalavra = null;
		if (!palavras.isEmpty()) {
			palavra = palavras.get(palavra);
		}
		return pesquisarPorPalavra;
	}

	public static void main(String[] args) {
		Dicionario dicionario = new Dicionario();

		// Adicionar palavras (linguagens de programação)
		dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
		dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
		dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

		// Exibir todas as palavras
		dicionario.exibirPalavras();

		// Pesquisar palavras
		String definicaoJava = dicionario.pesquisarPorPalavra("java");
		System.out.println("Definição da linguagem 'java': " + definicaoJava);

		String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
		System.out.println(definicaoCSharp);

		// Remover uma palavra
		dicionario.removerPalavra("typescript");
		dicionario.exibirPalavras();
	}
}
