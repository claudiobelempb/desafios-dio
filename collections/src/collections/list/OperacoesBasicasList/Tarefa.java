package collections.list.OperacoesBasicasList;

public class Tarefa {
	private String description;

	public Tarefa(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return description;
	}

}
