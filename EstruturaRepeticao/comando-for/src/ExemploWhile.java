import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        int cont = 0;

        while (mesada>0) {
            
            

            double valorDoce = ValorAleatorio();
            
            if(valorDoce > mesada) // na ultima iteracao se o valor do doce for maior
            //valorDoce = mesada;     // valor do doce sera igualado ao valor de mesada
            break; //vai parar a iteracao aqui quando nao puder comprar o doce mais

            System.out.println("Valor do doce "+ ++cont + ": " + valorDoce + " adicionado ao carrinho");
            mesada = mesada - valorDoce;
            System.out.println("Valor restante da mesada: " + mesada + "\n");
        }   
            System.out.println("Mesada: " + mesada);
            System.out.println("Joãozinho gastou toda sua mesada em doces");
        
    }
    private static double ValorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}   