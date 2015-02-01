public class Cubo implements VolumeCalculavel, AreaCalculavel {
	double lado;
	
	public Cubo(double lado) {
		this.lado = lado;
	}

	public double calcularVolume() {

		return 6*lado*lado;
	}

	public double calculaArea() {

		return lado*lado*lado;
	}

}
