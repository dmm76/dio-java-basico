import java.util.Locale;
import java.util.Scanner;

import org.xml.sax.SAXNotRecognizedException;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numeroNotas = 0;
        double notaAluno = 0.0;
        double somaNotas = 0.0;
        System.out.println("Digite o numero de provas do Aluno: ");
        numeroNotas = scanner.nextInt();
        for(int i = 1; i <= numeroNotas; i++){
            System.out.println("Digite a nota " + i + " da prova do Aluno: ");
            notaAluno = scanner.nextInt();
            somaNotas = somaNotas + notaAluno;
        }
        double mediaFinal = somaNotas / numeroNotas;

        if (mediaFinal >= 7) {
            System.out.println("Média: "+ mediaFinal + " Aprovado");
        }else
        System.out.println("Média: "+ mediaFinal + " Recuperação");
        
    }
}
