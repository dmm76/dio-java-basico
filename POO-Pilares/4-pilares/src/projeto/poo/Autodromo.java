package projeto.poo;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		
		jeep.ligar();
		jeep.setChassi("897654321");
		
		Moto z400 = new Moto();
		
		z400.setChassi("123456789");
		
		z400.ligar();
		
		Veiculo coringa = z400;
		coringa.ligar();
	}
	
}
