package MetodosAbstratos;

public class Circulo extends Forma{
	private Double raio;
	
	public Circulo() {
	}
	
	public Circulo(Cores cores, Double raio) {
		super(cores);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}

}
