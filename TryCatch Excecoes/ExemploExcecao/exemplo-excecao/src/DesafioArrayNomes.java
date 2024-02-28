import java.util.Scanner;

public class DesafioArrayNomes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        String[] nome = new String[10];


		for(int i=0 ; i<10 ; i++){
            System.out.print( "Informe os nomes: ");
            nome[i] = sc.nextLine();

        }
     System.out.println(nome[2]);
     System.out.println(nome[6]);
     System.out.println(nome[8]);
    }
}