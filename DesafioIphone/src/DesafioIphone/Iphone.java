package DesafioIphone;

public class Iphone implements AparelhoTelefonico, RepodutorMusicial, NavegadorInternet {

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo Página");

	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionado nova Página");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Página");

	}

	@Override
	public void tocar() {
		System.out.println("Musica tocando");

	}

	@Override
	public void pausar() {
		System.out.println("Musica pausada");

	}

	@Override
	public void selecionarMusica() {
		System.out.println("Musica selecionada");

	}

	@Override
	public void ligar() {
		System.out.println("Telefone ligando");

	}

	@Override
	public void atender() {
		System.out.println("Atender Telefone");

	}

	@Override
	public void iniciarCorrerioVoz() {
		System.out.println("Telefone iniciar correio voz");

	}

}
