import java.util.Scanner;
import java.util.Locale;

public class PlanoOperadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escolha entre os Plano: 1: Basic| 2: Midia| 3: Turbo");
        System.out.println("Escolha: 1 para Plano Basic - 100 minutos de ligação");
        System.out.println("Escolha: 2 para Plano Midia - 100 minutos de ligação + Whatsapp + Instagram gratis");
        System.out.println("Escolha: 3 para Plano Turbo - 100 minutos de ligação + Whatsapp + Instagram + 5Gb Youtube gratis");
        String plano = scanner.nextLine();
        
        switch (plano) {
            case "1":
            System.out.println("Plano Basic escolhido\nAgradecemos por escolher nossa empresa");
                break;
            case "2":
                System.out.println("Plano Midia + Whatsapp e Instagram grátis\nAgradecemos por escolher nossa empresa");
                break;
            case "3":
                System.out.println("Plano Turbo + Whatsapp + Instagram e 5Gb Youtube grátis\nAgradecemos por escolher nossa empresa");
                break;    
            default:
                break;
        }
    }
}
