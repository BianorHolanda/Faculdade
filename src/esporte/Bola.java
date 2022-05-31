package esporte;

public abstract class Bola implements Arremessavel {
	public abstract void Marcar();
	public abstract void quicar();
			
	@Override
	public void arremesar() {
		System.out.println("A bola foi arremessada");
		
	}

}
