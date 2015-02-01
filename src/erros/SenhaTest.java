package erros;

public class SenhaTest {
	static void autenticar(String senha) throws SenhaInvalidaException {

		if ("123".equals(senha)) {
			// autenticado
			System.out.println("autenticado");

		} else {
			// senha incorreta
			throw new SenhaInvalidaException("Senha incorretA");
		}
	}

	public static void main(String[] args) {

	}

}
