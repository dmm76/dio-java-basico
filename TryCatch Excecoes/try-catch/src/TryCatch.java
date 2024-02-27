import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
     try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        Double altura = scanner.nextDouble();

        System.out.println("Meu nome é " + nome.toUpperCase() + " " + sobrenome.toUpperCase()+ ".");
        System.out.println("Minha idade é: " + idade + " anos.");
        System.out.println("Minha altura é: " + altura + " cm.");
        }
        catch(InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}
