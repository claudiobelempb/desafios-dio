package collections.set.PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	private Set<Tarefa> tarefas;

	public ListaTarefas() {
		this.tarefas = new HashSet<Tarefa>();
	}

	public void adicionarTarefa(String descricao) {
		Tarefa tarefa = new Tarefa(descricao);
		tarefas.add(tarefa);
	}

	public void removerTarefa(String descricao) {
		Tarefa tarefaParaRemover = null;
		if (!tarefas.isEmpty()) {
			for (Tarefa tarefa : tarefas) {
				if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
					tarefaParaRemover = tarefa;
					break;
				}
			}
			tarefas.remove(tarefaParaRemover);
		} else {
			System.out.println("O conjunto está vazio");
		}

		if (tarefaParaRemover == null) {
			System.out.println("Tarefa não encontrada!");
		}
	}

	public void exibirTarefas() {
		if (!tarefas.isEmpty()) {
			System.out.println(this.tarefas);
		} else {
			System.out.println("Tarefa não encontrada!");
		}
	}

	public int contarTarefas() {
		return this.tarefas.size();
	}

	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> tarefasConcluidas = new HashSet<Tarefa>();
		for (Tarefa tarefa : tarefas) {
			if (tarefa.isConcluida()) {
				tarefasConcluidas.add(tarefa);
			}
		}
		return tarefasConcluidas;
	}

	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> tarefasNaoConcluidas = new HashSet<Tarefa>();
		for (Tarefa tarefa : tarefas) {
			if (!tarefa.isConcluida()) {
				tarefasNaoConcluidas.add(tarefa);
			}
		}
		return tarefasNaoConcluidas;
	}

	public void marcarTarefaConcluida(String descricao) {
		for (Tarefa tarefa : tarefas) {
			if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefa.setConcluida(true);
			}
		}
	}

	public void marcarTarefaPendente(String descricao) {
		Tarefa tarefaParaMarcarComoPendente = null;
		for (Tarefa tarefa : tarefas) {
			if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaMarcarComoPendente = tarefa;
				break;
			}
		}

		if (tarefaParaMarcarComoPendente != null) {
			tarefaParaMarcarComoPendente.setConcluida(true);
		} else {
			System.out.println("Tarefa não encontrada na lista.");
		}
	}

	public void limparListaTarefas() {
		if (tarefas.isEmpty()) {
			System.out.println("A lista já está vazia!");
		} else {
			tarefas.clear();
		}
	}
	
	public static void main(String[] args) {
	    // Criando uma instância da classe ListaTarefas
	    ListaTarefas listaTarefas = new ListaTarefas();

	    // Adicionando tarefas à lista
	    listaTarefas.adicionarTarefa("Estudar Java");
	    listaTarefas.adicionarTarefa("Fazer exercícios físicos");
	    listaTarefas.adicionarTarefa("Ler livro");
	    listaTarefas.adicionarTarefa("Preparar apresentação");

	    // Exibindo as tarefas na lista
	    listaTarefas.exibirTarefas();

	    // Removendo uma tarefa
	    listaTarefas.removerTarefa("Fazer exercícios físicos");
	    listaTarefas.exibirTarefas();

	    // Contando o número de tarefas na lista
	    System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

	    // Obtendo tarefas concluídas
	    System.out.println(listaTarefas.obterTarefasConcluidas());

	    // Obtendo tarefas pendentes
	    System.out.println(listaTarefas.obterTarefasPendentes());

	    // Marcando tarefas como concluídas
	    listaTarefas.marcarTarefaConcluida("Ler livro");
	    listaTarefas.marcarTarefaConcluida("Estudar Java");
	    listaTarefas.exibirTarefas();

	    // Marcando tarefas como pendentes
	    listaTarefas.marcarTarefaPendente("Estudar Java");
	    listaTarefas.exibirTarefas();

	    // Limpando a lista de tarefas
	    listaTarefas.limparListaTarefas();
	    listaTarefas.exibirTarefas();
	  }

}
