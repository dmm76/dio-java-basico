public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("8706010"); //no caso o cep é predeterminado
            System.out.println(cepFormatado);                   //para imprimir o mesmo
        } catch (CepInvalidoException e) {         // se a quantidade for diferente de 8
             System.out.println("Cep nao esta dentro das regras");                                                   //CepInvalidoException
            //e.printStackTrace();
        }
    }
    
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        //simulando um cep formatado
        return "86.060-100";
    }
}
