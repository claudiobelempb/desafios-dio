package PilaresPoo.Interface;

public class EquipamentoMultifuncional implements Impressora, Copiadora, Digitalizadora{

	@Override
	public void digitalizar() {
		System.out.println("Digitalizando");
		
	}

	@Override
	public void copiar() {
		System.out.println("Copiando");
		
	}

	@Override
	public void imprimir() {
		System.out.println("Imprimindo");
		
	}

}
