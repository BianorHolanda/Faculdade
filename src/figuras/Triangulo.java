package figuras;

public class Triangulo extends Forma {

	public Triangulo(int numLados) {
		super(numLados);
		System.out.println("3 lados");
	}

	public double getArea() {
		double areaTriangulo=(largura*altura)/2;
		System.out.println("A área do triangulo é: "+areaTriangulo);
		return 0;
	}
	public double getPerimetro(double l1, double l2,double l3) {
		double perimetroTriangulo=l1+l2+l3;
		System.out.println("O perimetro do triangulo é: "+ perimetroTriangulo);
		return 0;
	}


	@Override
	public void redimensionar(double x) {
		double altura2=altura+x;
		double largura2=largura+x;
		double areaR=(altura2*largura2)/2;
		System.out.println("A área redimensionada do triângulo é: "+ areaR);
		
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
