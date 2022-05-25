package figuras;

public class Triangulo extends Forma {

	public Triangulo(int numLados[]) {
		super(numLados);
		
	}

	public double getArea(double largura,double altura) {
		double areaTriangulo=(largura*altura)/2;
		System.out.println("A área do triangulo é: "+areaTriangulo);
		return 0;
	}
	public double getPerimetro(double l1,double l2, double l3) {
		double perimetroTriangulo=l1+l2+l3;
		System.out.println("O perimetro do triangulo é: "+ perimetroTriangulo);
		return 0;
	}

	@Override
	public double getPerimetro() {
		
		return 0;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
