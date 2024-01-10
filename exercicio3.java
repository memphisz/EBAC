import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = s.nextLine();
        System.out.println("Digite seu endereço: ");
        String endereco = s.nextLine();
        System.out.println("Digite o seu salário: ");
        double salario = s.nextDouble();
        String data = "20-12-2024";
        System.out.println("Eu "+nome+", morador do endereço: "+endereco+"\n"+"confirmo que recebi o salário de "+salario+" na data: "+data);
    }
}
