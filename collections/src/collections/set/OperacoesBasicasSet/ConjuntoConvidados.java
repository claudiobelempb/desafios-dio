package collections.set.OperacoesBasicasSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidados;

	public ConjuntoConvidados() {
		this.convidados = new HashSet<Convidado>();
	}

	public void adicionarConvidado(String nome, int codigoConvite) {
		Convidado convidado = new Convidado(nome, codigoConvite);
		this.convidados.add(convidado);
	}

	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado removerConvidadosProConvidado = null;
		if (!convidados.isEmpty()) {
			for (Convidado c : convidados) {
				if (c.getCodigoConvite() == codigoConvite) {
					removerConvidadosProConvidado = c;
					break;
				}
			}
		}
		convidados.remove(removerConvidadosProConvidado);
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
