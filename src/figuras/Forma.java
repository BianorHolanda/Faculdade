package figuras;

public abstract class Forma implements Redimensionavel {
	double numLados;
	double largura,altura;
	
	public Forma(int numLados) {
		super();
		this.numLados = numLados;
	}
	
	public Forma(double largura, double altura) {
		super();
		this.largura = largura;
		this.altura = altura;
	}
	
	public double getNumLados() {
		return numLados;
	}
	public void setNumLados(double numLados) {
		this.numLados = numLados;
	}
	
	public abstract double getArea();
	public abstract double getPerimetro();

	
}
