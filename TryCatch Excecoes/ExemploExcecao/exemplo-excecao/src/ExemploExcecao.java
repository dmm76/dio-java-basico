import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor;
        //Number valor = Double.valueOf("a1.75"); //valueof convert string em double
        //Erro Runtime Exception
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            //Erro Exception
            System.out.println(valor);
            } catch (ParseException e) {
                e.printStackTrace();
                System.out.println("Nao pode haver caracteres alfanumericos");
            }
    }
}
