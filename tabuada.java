import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bem vindo a tabuada java ;D");
        System.out.println("Digite qual tabuada você quer ver: ");
        //usar o nextINT pois estamos usando uma variavel inteira
        int numero = s.nextInt();
        for (int i = 0;i <= 10; i++) {
            int calc = numero * i;
            System.out.println(numero+"X"+i+"="+calc);
        }
}}

