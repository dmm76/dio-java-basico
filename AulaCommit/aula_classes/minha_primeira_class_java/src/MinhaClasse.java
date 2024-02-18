public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Douglas";
        String segundoNome = "Monquero";
        String nomeCompleto = nomeCompleto2(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
      
    }

    public static String nomeCompleto2(String primeiroNome, String segundoNome){
        return "Resultado do Método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
