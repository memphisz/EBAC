

public class tarefaCalculoMedia {
    public static void main(String args[]) {
        notas();
    }
    public static void notas() {
        double nota1 = 4.5;
        double nota2 = 9;
        double nota3 = 7.5;
        double nota4 = 8.8;
        double soma = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média do aluno é: " + soma);
    }
}

