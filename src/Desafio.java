
public class Desafio {

	public static void main(String[] args) {
		int num1=0;
		int num2 = 1;
		int tela = num2;
		System.out.print(""+ num1 + "\t" +num2);
		//0 1 t1 2 t3 4 t7 11
		for (int i = 0; i < 20; i++) {
			tela = num1 +num2;
			System.out.print("\t"+tela);
			num1 =num2;
			num2 = tela;
		}
		
		
	}
}
