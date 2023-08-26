package collections.list.PesquisaList;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	private List<Livro> livros;

	public CatalogoLivros() {
		this.livros = new ArrayList<Livro>();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		Livro livro = new Livro(titulo, autor, anoPublicacao);
		livros.add(livro);
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> autors = new ArrayList<Livro>();

		if (!livros.isEmpty()) {
			for (Livro livro : livros) {
				if (livro.getAutor().equalsIgnoreCase(autor)) {
					autors.add(livro);
				}
			}
		}
		return autors;
	}

	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> intervaloAnos = new ArrayList<Livro>();
		if (!livros.isEmpty()) {
			for (Livro livro : livros) {
				if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
					intervaloAnos.add(livro);
				}
			}
		}
		return intervaloAnos;
	}

	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if (!livros.isEmpty()) {
			for (Livro livro : livros) {
				if (livro.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = livro;
					break;
				}
			}
			return livroPorTitulo;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

}
