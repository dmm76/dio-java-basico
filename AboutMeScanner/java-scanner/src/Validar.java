import java.util.Scanner;

public class Validar{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		System.out.println("Digite o primeiro numero: ");
		A = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		B = sc.nextInt();
		
		PROD = (A + B);

		System.out.println("PROD = " + PROD);
	}
}