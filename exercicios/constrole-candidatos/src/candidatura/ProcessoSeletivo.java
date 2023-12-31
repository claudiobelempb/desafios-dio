package candidatura;

import static java.util.concurrent.ThreadLocalRandom.current;

import java.util.Random;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo Seletivo");

		String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };
		boolean tentativas = atender();
		for (String candidato : candidatos) {
			entrandoEncontato(candidato);
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato + "APÓS " + tentativas + " TENTATIVA(S)");

			System.out.println("NÃO CONSEGUIMOS CONTATO COM O " + candidato + ".");

		}
	}

	static void entrandoEncontato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;

		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if (continuarTentando) {
				tentativasRealizadas++;
			} else {
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			}
		} while (continuarTentando && tentativasRealizadas < 3);

		if (atendeu) {
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
		} else {
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO TENTATIVAS "
					+ tentativasRealizadas + " REALIZADA");
		}
	}

	static boolean atender() {
		return new Random().nextInt(3) == 1;
	}

	static void imprimirSelecionados() {
		String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO" };
		System.out.println("Imprimindo a lista de candidatos informando seu indice do elemento");
		for (int i = 0; i < candidatos.length; i++) {
			System.out.println("O candidato de nº " + (i + 1) + " é o " + candidatos[i]);
		}

		System.out.println("Form abreviada.");
		for (String candidato : candidatos) {
			System.out.println("O candidato é o " + candidato);
		}
	}

	static double valorPretendido() {
		return current().nextDouble(1800, 2200);
	}

	static void selecaoCandidatos() {
		String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
				"DANIELA", "JORGE" };
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;

		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();

			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para vaga");
				candidatosSelecionados++;
			}

			System.out.println("O candidato " + candidato + " solicitou esse valor de salário " + salarioPretendido);
			candidatoAtual++;
		}
	}

	static void analisarCandidato(double salarioPretendito) {
		double salarioBase = 2000.0;
		if (salarioBase >= salarioPretendito) {
			System.out.println("LIGAR PARA O CANDIDATO.");
		} else if (salarioBase == salarioPretendito) {
			System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA.");
		} else {
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
		}
	}
}
