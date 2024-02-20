import java.util.Scanner;
import java.util.Locale;

public class ContaTeminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da agencia: ");
        String agencia = scanner.next();

        System.out.println("informe o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, informe seu primeiro nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, informe seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Por favor, informe seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Ola, " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco.\nSua agencia é "+ agencia + "\nSua conta é "+ numero + "\nSeu saldo no valor de R$ "+ saldo + " já esta disponivel para saque.");


    }
}