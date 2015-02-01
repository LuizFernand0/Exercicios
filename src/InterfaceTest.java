public class InterfaceTest {
	public static void area(AreaCalculavel o){
		
		System.out.println(o.calculaArea());
	}
	public static void main(String[] args) {
	Quadrado  q = new Quadrado(2);
	AreaCalculavel a = q;
	
	}
}
