import java.util.Locale;
import java.util.Scanner;

import org.xml.sax.SAXNotRecognizedException;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 25.0;
        double valorsolicitado = 0.0;
        System.out.println("Digite o valor solicitado para retirada: ");
        valorsolicitado = scanner.nextDouble();

        if (valorsolicitado<saldo) {
            saldo = saldo - valorsolicitado;
            System.out.println("Seu saldo é de: R$ "+ saldo + " reais.");
        }else
            System.out.println("Saldo insuficiente");
        
    }
}
