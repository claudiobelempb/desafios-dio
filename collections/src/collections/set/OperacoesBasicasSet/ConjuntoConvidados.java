package collections.set.OperacoesBasicasSet;

import java.util.HashSet;

public class ConjuntoConvidados {
	private HashSet<Convidado> convidados;

	public ConjuntoConvidados() {
		this.convidados = new HashSet<Convidado>();
	}

	public void adicionarConvidado(String nome, int codigoConvite) {
		Convidado convidado = new Convidado(nome, codigoConvite);
		this.convidados.add(convidado);
	}

	public void removerConvidadoPorCodigoConvite(Integer codigoConvite) {
		HashSet<Convidado> removerConvidadosProConvidado = new HashSet<Convidado>();
		if (!convidados.isEmpty()) {
			for (Convidado c : convidados) {
				if (c.getCodigoConvite().equals(codigoConvite)) {
					removerConvidadosProConvidado.add(c);
				}
			}
		}
		convidados.removeAll(removerConvidadosProConvidado);
	}

	public int contarConvidados() {
		return convidados.size();
	}

	public void exibirConvidados() {
		if (!convidados.isEmpty()) {
			System.out.println(this.convidados);
		} else {
			System.out.println("A lista está vazia!");
		}
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		
		conjuntoConvidados.adicionarConvidado("Convidado 01", 1);
		conjuntoConvidados.adicionarConvidado("Convidado 02", 2);
		conjuntoConvidados.adicionarConvidado("Convidado 03", 3);
		
		conjuntoConvidados.removerConvidadoPorCodigoConvite(3);
		
		conjuntoConvidados.exibirConvidados();
		System.out.println(conjuntoConvidados.contarConvidados());
		
		
	}
}
