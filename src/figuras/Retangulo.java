package figuras;

public class Retangulo extends Forma {

	public Retangulo(int numLados) {
		super(numLados);
		
	}

	public double getArea() {
		double areaRetangulo=largura*altura;
		System.out.println("A �rea do retangulo �: "+areaRetangulo);
		return 0;
	}

	
	public double getPerimetro() {
		double perimetroRetangulo=(largura*2)+(altura*2);
		System.out.println("O perimetro do ret�ngulo �: "+ perimetroRetangulo);
		return 0;
	}


	@Override
	public void redimensionar(double x) {
		double altura2=altura+x;
		double largura2=largura+x;
		double areaRedimensionada=(altura2*largura2);
		System.out.println("A �rea redimensionada do Ret�ngulo �: "+ areaRedimensionada);
		
	}
	
}
