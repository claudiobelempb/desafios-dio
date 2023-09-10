package dio.myfirstwebapi.handler;

public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 3122526520192109011L;

	public BusinessException(String mensagem) {
		super(mensagem);
	}

	public BusinessException(String mensagem, Object... params) {
		super(String.format(mensagem, params));
	}
}
