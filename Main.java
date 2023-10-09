package media;


public class Main {

    public static void main(String[] args) {
      
        double[] valores = {10, 20, 30};
        CalculadoraMedia med = new CalculadoraMedia();
        double media = med.calcularMedia(valores);
        System.out.println(media);

        // Falha: o resultado é incorreto, a média deveria ser 20.0, mas retorna 19.0
        if (media != 20.0) {
            System.out.println("Falha! O resultado da média está incorreto.");
        } else {
            System.out.println("Teste passou! A média está correta.");
        }
    }
}
    