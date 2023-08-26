package collections.list.OperacoesBasicasList;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	
	private List<Tarefa> tarefaList;

	public ListaTarefas() {
		this.tarefaList = new ArrayList<>();
	}

	public void adicionarTarefa(String description) {
		tarefaList.add(new Tarefa(description));
	}
	
	public void removerTarefa(String description) {
		List<Tarefa> removerTarefas = new ArrayList<>();
		for(Tarefa t : tarefaList) {
			if(t.getDescription().contentEquals(description)) {
				removerTarefas.add(t);
			}
		}
		tarefaList.removeAll(removerTarefas);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas(){
		System.out.println(tarefaList);
	}

}
