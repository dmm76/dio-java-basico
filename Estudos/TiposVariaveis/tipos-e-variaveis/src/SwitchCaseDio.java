import java.util.Scanner;

public class SwitchCaseDio {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
  
      System.out.println("Bem-vindo ao Barão Burger!");
      System.out.println("Escolha o combo desejado:");
      System.out.println("1 - Barãozinho = R$ 12");
      System.out.println("2 - Barão Banco = R$ 23");
      System.out.println("3 - Barão Duplo = R$ 31");
      System.out.println("4 - Barão Nordestino = R$ 28");
      System.out.println("5 - Barão Fit = R$ 15");
  
      int pedido, valor, troco, dinheiro;
  
      System.out.print("Digite o número do combo desejado: ");
      pedido = scanner.nextInt();
  
      System.out.print("Digite o valor pago pelo cliente: ");
      dinheiro = scanner.nextInt();
  
      // Atribui o valor correspondente ao combo escolhido
      switch (pedido) {
        case 1:
          valor = 12; break;
        case 2:
          valor = 23; break;
        case 3:
          valor = 31; break;
        case 4:
          valor = 28; break;
        case 5:
          valor = 15; break;
        default:
          valor = 0;
          break;
      }
  
      troco = dinheiro - valor;
  
      // Adequando o resultado da saída com base no valor do troco
      if (troco == 0) {
        System.out.println("Transação concluída com sucesso!");
      } else if (troco > 0) {
        System.out.printf("Troco de %d reais\n", troco);
      } else {
        System.out.printf("Saldo insuficiente! Faltam %d reais\n", -troco);
      }

    }
  }