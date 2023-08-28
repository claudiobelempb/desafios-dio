package collections.set.PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	private Set<Contato> contatos;

	public AgendaContatos() {
		this.contatos = new HashSet<Contato>();
	}

	public void adicionarContato(String nome, int numero) {
		Contato contato = new Contato(nome, numero);
		contatos.add(contato);
	}

	public void exibirContatos() {
		System.out.println(contatos);
	}

	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatosNome = new HashSet<Contato>();
		for (Contato c : contatos) {
			if (c.getNome().startsWith(nome)) {
				contatosNome.add(c);
			}
		}
		return contatosNome;
	}

	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for (Contato c : contatos) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
}
