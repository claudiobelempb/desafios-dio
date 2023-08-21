package sintaxe;

public class FormatarCep {
	public static void main(String[] args) {
		String cep;
		try {
			cep = formatarCep("5825500");
			System.out.println(cep);
		} catch (CepInvalidoException e) {
			// TODO Auto-generated catch block
			System.out.println("Cep tem que ter no minimo 8 digitos!");
			//e.printStackTrace();
		}
	}
	static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
