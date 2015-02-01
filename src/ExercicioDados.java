import java.util.Random;

import javax.activation.MailcapCommandMap;
import javax.swing.JOptionPane;

public class ExercicioDados {

	public static void main(String[] args) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("adivinhe"));
		int dado;

		Random sort = new Random();
		
		dado = sort.nextInt(6);
		
		if (valor == dado)
			JOptionPane.showMessageDialog(null,"voçe acertou" );
		
		else JOptionPane.showMessageDialog(null,"voçe errou ");
		} 
		
	}

