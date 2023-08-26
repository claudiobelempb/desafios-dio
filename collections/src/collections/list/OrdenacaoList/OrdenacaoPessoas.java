package collections.list.OrdenacaoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	private List<Pessoa> pessoas;

	public OrdenacaoPessoas() {
		this.pessoas = new ArrayList<Pessoa>();
	}

	public void adicionarPessoa(String nome, int idade, double altura) {
		Pessoa pessoa = new Pessoa(nome, idade, altura);
		pessoas.add(pessoa);
	}

	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoas);
		if (!pessoas.isEmpty()) {
			Collections.sort(pessoasPorIdade);
			return pessoasPorIdade;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);
		if (!pessoas.isEmpty()) {
			Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
			return pessoasPorAltura;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
}
