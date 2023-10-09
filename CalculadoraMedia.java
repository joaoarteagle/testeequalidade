package media;

public class CalculadoraMedia {
    public double calcularMedia(double[] valores) {
        return sum(valores) / valores.length-1;
    }

    public double sum(double[] valores) {
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma;
    }
}
