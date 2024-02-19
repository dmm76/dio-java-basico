public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;
        int a = 2024;
        int b = 1976;

        if (condicao1 && condicao2) 
            System.out.println("Resposta 1: As duas condicoes sao verdadeiras");
            else
                System.out.println("Resposta 1: Uma ou ambas sao falsas");

        if (condicao1 || condicao2) 
        System.out.println("Resposta 2: Uma das condições é verdadeiras");

        //validando outras opcoes
        if (condicao1 && (a > b)) 
            System.out.println("Resposta 3: As duas condicoes sao verdadeiras");
            else
                System.out.println("Resposta 3: Uma ou ambas sao falsas");
    }      
}
