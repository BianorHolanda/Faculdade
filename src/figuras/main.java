package figuras;

public class main {

	public static void main(String[] args) {
		Retangulo r1= new Retangulo(4);
		Triangulo t1= new Triangulo(3);
		System.out.println("----------RETANGULO----------------------- \n");
		r1.altura=2;
		r1.largura=3;
		r1.getArea();
		r1.getPerimetro();
		r1.redimensionar(2);
		
		System.out.println("\n ----------TRIANGULO---------------------- \n");
		
		t1.altura=5;
		t1.largura=4;
		t1.getArea();
		t1.getPerimetro(4, 3, 3);
		t1.redimensionar(2);
		
		System.out.println("\n ----------AREA REDIMENSIONADA POR 0.5---------------- \n");
		Forma[] formas = new Forma[2];
		formas[0] = t1;
		formas[1] = r1;
		
		for( Forma forma:formas) {
			forma.redimensionar(0.5f);
		}
	}
	}


