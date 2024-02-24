import java.util.Scanner;
import java.util.Locale;

public class EscolhaTamanho {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Infome a sigla para o tamanho: P|M|G");
        String sigla = scanner.nextLine();

        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Médio");
                break;
            case "G":
                System.out.println("Grande");
                break;

            default:
                break;
        }
    }
}