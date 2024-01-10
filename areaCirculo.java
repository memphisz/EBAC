import java.text.DecimalFormat;

public class areaCirculo {
    public static void main(String[] args) {
        double area, n, raio;
        n = 3.14159;
        raio = 2.00;
        area = (raio * raio) * n;

        // Formatando o resultado de 'area' com um número específico de casas
        DecimalFormat formato = new DecimalFormat("#.####");
        String numeroFormatado = formato.format(area);
        //substituindo virgula por ponto
        numeroFormatado = numeroFormatado.replace(',', '.');
        //convertendo de string para double 
        double areaFormatada = Double.parseDouble(numeroFormatado);

        // Imprimindo o resultado
        System.out.println("A = " + areaFormatada);
    }
}
