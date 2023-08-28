package collections.set.PesquisaSet;

import java.util.Objects;

public class Tarefa {
	private String descricao;
	private boolean isConcluida;

	public Tarefa(String descricao) {
		this.descricao = descricao;
		this.isConcluida = false;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isConcluida() {
		return isConcluida;
	}

	public void setConcluida(boolean isConcluida) {
		this.isConcluida = isConcluida;
	}

	@Override
	public String toString() {
		return "Tarefa [descticao=" + descricao + ", isConcluida=" + isConcluida + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(isConcluida, descricao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return isConcluida == other.isConcluida && Objects.equals(descricao, other.descricao);
	}

}
