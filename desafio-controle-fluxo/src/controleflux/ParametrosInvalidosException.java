package controleflux;

public class ParametrosInvalidosException extends Exception {

	private static final long serialVersionUID = 1L;

	public ParametrosInvalidosException(String errorMessage) {
        super(errorMessage);
    }

};
