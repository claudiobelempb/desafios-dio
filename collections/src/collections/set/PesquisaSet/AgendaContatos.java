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

	public static void main(String[] args) {
		// Criando uma instância da classe AgendaContatos
		AgendaContatos agendaContatos = new AgendaContatos();

		// Exibindo os contatos no conjunto (deve estar vazio)
		agendaContatos.exibirContatos();

		// Adicionando contatos à agenda
		agendaContatos.adicionarContato("João", 123456789);
		agendaContatos.adicionarContato("Maria", 987654321);
		agendaContatos.adicionarContato("Maria Fernandes", 55555555);
		agendaContatos.adicionarContato("Ana", 88889999);
		agendaContatos.adicionarContato("Fernando", 77778888);
		agendaContatos.adicionarContato("Carolina", 55555555);

		// Exibindo os contatos na agenda
		agendaContatos.exibirContatos();

		// Pesquisando contatos pelo nome
		System.out.println(agendaContatos.pesquisarPorNome("Maria"));

		// Atualizando o número de um contato
		Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
		System.out.println("Contato atualizado: " + contatoAtualizado);

		// Exibindo os contatos atualizados na agenda
		System.out.println("Contatos na agenda após atualização:");
		agendaContatos.exibirContatos();
	}
}
