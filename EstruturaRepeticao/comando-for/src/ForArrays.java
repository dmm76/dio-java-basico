import java.utils.String;

public class ForArrays {
    public static void main(String[] args) throws Exception {
        String alunos[] = {"Douglas", "Marcelo", "Monquero", "Indefinido"};

        for(int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x: "+ x + " é: " + alunos[x]);
        }
    }
}
