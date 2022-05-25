package figuras;

public abstract class Forma {
	int numLados[];
	double largura,altura;
	public abstract double getArea();
	public abstract double getPerimetro();

	public Forma(int numLados[]) {
		
		this.numLados = numLados;
	}
	public int[] getNumLados() {
		return numLados;
	}
	public void setNumLados(int[] numLados) {
		this.numLados = numLados;
	}

	
}
