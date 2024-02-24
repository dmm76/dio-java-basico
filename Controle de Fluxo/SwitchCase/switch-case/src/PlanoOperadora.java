import java.util.Scanner;
import java.util.Locale;

public class PlanoOperadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int opt = 0;
    do {
        System.out.println("Escolha entre os Plano: 1: Basic| 2: Midia| 3: Turbo.");
        System.out.println("Escolha: 1 para Plano Basic - 100 minutos de ligação.");
        System.out.println("Escolha: 2 para Plano Midia - 100 minutos de ligação + Whatsapp + Instagram gratis.");
        System.out.println("Escolha: 3 para Plano Turbo - 100 minutos de ligação + Whatsapp + Instagram + 5Gb Youtube gratis.");
        System.out.println("Escolha: 4 para Sair do Menu.");
        opt = scanner.nextInt();
        
        switch (opt) {
            case 1:
                System.out.println("Plano Basic escolhido\nAgradecemos por escolher nossa empresa");
                break;
            case 2:
                System.out.println("Plano Midia + Whatsapp e Instagram grátis\nAgradecemos por escolher nossa empresa");
                break;
            case 3:
                System.out.println("Plano Turbo + Whatsapp + Instagram e 5Gb Youtube grátis\nAgradecemos por escolher nossa empresa");
                break;
            case 4:
                System.out.println("Saindo do Menu\nObrigado por usar nossos serviços.\n");
                break;
            default:
                System.out.println("Opção inválida - escolha um plano 4 para sair");
                break;
        }
        

    }while (opt != 4);
      
    } 
}
