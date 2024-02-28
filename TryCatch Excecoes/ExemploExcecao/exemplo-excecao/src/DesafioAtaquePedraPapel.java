import java.util.Scanner; 

public class DesafioAtaquePedraPapel {
   
    public static void main(String[] args) {
      	Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha quantas tentativas: ");
    	int N = scanner.nextInt();
    	String jogador1, jogador2;

    	for (int i = 0; i < N; i++) {
    	    System.out.println("Escolha: ataque|papel|pedra");
    		jogador1 = scanner.next();
    	    System.out.println("Escolha: ataque|papel|pedra");
    		jogador2 = scanner.next();
    		if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque"))
    		      System.out.println("Aniquilacao mutua");
    		else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel"))
    		      System.out.println("Ambos venceram");
    		else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("pedra"))
    		      System.out.println("Jogador 1 venceu");
            else if (jogador2.equalsIgnoreCase("ataque") && jogador1.equalsIgnoreCase("pedra"))
    		      System.out.println("Jogador 2 venceu");
    		else if (jogador2.equalsIgnoreCase("ataque")&& jogador1.equalsIgnoreCase("papel"))
    		      System.out.println("Jogador 2 venceu");
            else if (jogador1.equalsIgnoreCase("ataque")&& jogador2.equalsIgnoreCase("papel"))
    		      System.out.println("Jogador 1 venceu");
    		else if (jogador2.equalsIgnoreCase("papel") && jogador1.equalsIgnoreCase("pedra"))
    		      System.out.println("Jogador 1 venceu");
            else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("pedra"))
    		      System.out.println("Jogador 2 venceu");      
    		else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("pedra"))
    		      System.out.println("Sem ganhador");
    		else System.out.println("Escolha errada");
    	}
    }
}