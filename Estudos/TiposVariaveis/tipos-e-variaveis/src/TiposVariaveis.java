public class TiposVariaveis {
    public static void main(String[] args) {
        byte idade = 33;
        short ano = 2021;
        int cep = 87060110;
        long cpf = 987654321;
        float pi = 3.14f;
        double salario = 5123.56;

        short numeroCurto = 100;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //erro para demonstração // casting (short) 

        // short numeroCurto = 100;
        // short numeroNormal2 = 1000;
        // int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal2;

        System.out.println(numeroCurto2);

    }
}
