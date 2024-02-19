public class OperadorRelacional {
    public static void main(String[] args){
        int numeroUm = 1;
        int numeroDois = 2;

        // Operador Igual
        boolean simNao = numeroUm == numeroDois;
        System.out.println("Numero 1 é maior que numero 2: " + simNao);
            
        // Operador Diferente
        simNao = numeroUm != numeroDois;
        System.out.println("Numero 1 é diferente de numero 2: " + simNao);

        // Operador Maior
        simNao = numeroUm > numeroDois;
        System.out.println("Numero 1 é maior que numero 2: " + simNao);

        // Operador Menor
        simNao = numeroUm < numeroDois;
        System.out.println("Numero 1 é menor que numero 2: " + simNao);

        //Operador com condicao if
        if (numeroUm < numeroDois) {
            System.out.println("Numero 1 é menor que numero 2: Verdadeiro");
        }

        //Conteudo de String
        String nomeUm = "DOUGLAS";
        String nomeDois = "DOUGLAS";

        System.out.println(nomeUm == nomeDois);

        //Comparando objetos String
        nomeUm = "DOUGLAS";
        nomeDois = new String("DOUGLAS");
        System.out.println("Comparando String com Objeto String = Caso 01");
        System.out.println(nomeUm == nomeDois);

        nomeUm = "DOUGLAS";
        nomeDois = new String("DOUGLAS");
        System.out.println("Comparando String com Objeto String = Caso 02 - usando .equals");
        System.out.println(nomeUm.equals(nomeDois));

    }


}