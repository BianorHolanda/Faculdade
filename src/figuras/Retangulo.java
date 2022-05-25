package figuras;

public class Retangulo extends Forma {

	public Retangulo(int numLados[]) {
		super(numLados);
		
	}

	public double getArea(double largura,double altura) {
		double areaRetangulo=largura*altura;
		System.out.println("A área do retangulo é: "+areaRetangulo);
		return 0;
	}

	
	public double getPerimetro(double largura, double altura) {
		double perimetroRetangulo=(largura*2)+(altura*2);
		System.out.println("O perimetro do retângulo é: "+ perimetroRetangulo);
		return 0;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getPerimetro() {
		return 0;
		// TODO Auto-generated method stub
		
	}
	
}
