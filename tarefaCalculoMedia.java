import java.util.Scanner;

public class tarefaCalculoMedia {
    public static void main(String args[]) {

    // Scanner para ler dados de entrada fornecidos pelo usuário
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = s.nextDouble();
    //  Atribuição do dado fornecido pelo usuario a variavel nota
        System.out.println("Digite a segunda nota: ");
        double nota2 = s.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = s.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double nota4 = s.nextDouble();
        double soma = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média do aluno é: " + soma);
    }
}

