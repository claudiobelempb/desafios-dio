package collections.set.OperacoesBasicasSet;

public class Convidado {
	private String nome;
	private Integer codigoConvite;

	public Convidado(String nome, Integer codigoConvite) {
		super();
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}

	public String getNome() {
		return nome;
	}

	public Integer getCodigoConvite() {
		return codigoConvite;
	}

	@Override
	public String toString() {
		return "Convidado [name=" + nome + ", codigoConvite=" + codigoConvite + "]";
	}

}
