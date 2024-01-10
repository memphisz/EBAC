import java.util.Scanner;

public class exemploIdade {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = s.nextInt();
        String idadeP = getIdade(idade);
        System.out.println(idadeP);
    }
    public static String getIdade(int idade) {
        if (idade >= 1 && idade <= 5) {
            return "Você é um bebê";
        } else if (idade > 5 && idade <= 10) {
            return "Você é uma criança";
        } else if (idade > 10 && idade < 18) {
            return "Você é um adolescente";
        } else {
            return "Você é um adulto";
        }
    }
}
