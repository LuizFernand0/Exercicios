import javax.swing.JOptionPane;

public class Matematica {
	int result = 0;

	public void CalculaRaiz(int num) {// num= 64
		int i = 0;

		do {

			num = num - i;
			result += 1;

			i = i + 2;

		} while (num >= i);

	}

	public static void main(String[] args) {

		Matematica teste = new Matematica();
		teste.CalculaRaiz(65536);
		JOptionPane.showMessageDialog(null, teste.result);

	}

}
