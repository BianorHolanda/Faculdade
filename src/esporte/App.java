package esporte;

public class App {

	public static void main(String[] args) {
		Pedra p1 = new Pedra();
		p1.arremesar();
		
		Bola f1 = new Futebol();
		f1.arremesar();
		f1.Marcar();
		f1.quicar();
		
		Bola b1= new Beisebol();
		b1.arremesar();
		b1.Marcar();
		b1.quicar();

	}

}
