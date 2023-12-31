package sintaxe;

public class CepInvalidoException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static String formatarCep(String cep) throws CepInvalidoException {
		if (cep.length() != 8)
			throw new CepInvalidoException();

		// simulando um cep formatado
		return "230.765-064-00";
	}
}
