package collections.map.OperacoesBasicaMap;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> contatos;

	public AgendaContatos() {
		this.contatos = new HashMap<String, Integer>();
	}

	public void adicionarContato(String nome, Integer telefone) {
		contatos.put(nome, telefone);
	}

	public void removerContato(String nome) {
		if (!contatos.isEmpty()) {
			contatos.remove(nome);
		} else {
			System.out.println("Contatos não encontrada!");
		}
	}

	public void exibirContatos() {
		System.out.println(contatos);
	}

	public Integer pesquisarPorNome(String nome) {
		Integer numeroProNome = null;
		if (!contatos.isEmpty()) {
			numeroProNome = contatos.get(nome);
		}
		return numeroProNome;
	}

	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();

		// Adicionar contatos
		agendaContatos.adicionarContato("Camila", 123456);
		agendaContatos.adicionarContato("João", 5665);
		agendaContatos.adicionarContato("Carlos", 1111111);
		agendaContatos.adicionarContato("Ana", 654987);
		agendaContatos.adicionarContato("Maria", 1111111);
		agendaContatos.adicionarContato("Camila", 44444);

		agendaContatos.exibirContatos();

		// Remover um contato
		agendaContatos.removerContato("Maria");
		agendaContatos.exibirContatos();

		// Pesquisar número por nome
		String nomePesquisa = "João";
		Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
		System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

		String nomePesquisaNaoExistente = "Paula";
		Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
		System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
	}
}
