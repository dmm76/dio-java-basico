import java.util.Scanner;

public class Contador{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        int numeroUm = sc.nextInt();

        System.out.println("Informe o segundo valor: ");
        int numeroDois = sc.nextInt();
    
        try {
             contar(numeroUm, numeroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo numero deve ser maior que o primeiro");
        }

    }
    static void contar(int nUm, int nDois) throws ParametrosInvalidosException{
            if(nUm > nDois)
            throw new ParametrosInvalidosException();

            int contador = nDois - nUm;
            for(int i = 1 ; i <= contador; i++)
                System.out.println("Imprimindo numero "+ i);
            
    }   

}
