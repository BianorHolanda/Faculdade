package figuras;

public class main {

	public static void main(String[] args) {
		Retangulo r1= new Retangulo(null);
		Triangulo t1= new Triangulo(null);
		r1.getArea(2,3);
		r1.getPerimetro(2,3);
		
		t1.getArea(4, 5);
		t1.getPerimetro(4, 3, 3);

	}

}
