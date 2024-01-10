import java.util.Scanner;

public class switchExercicio {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //dado o valor de 1 a 7 imprima se é dia útil ou final de semana.
        System.out.println("Digite um número de 1 a 7 considerando que 1 é domingo");
        int num = s.nextInt();
        String dia = getSwich(num);
        System.out.println(num+" É um "+dia);
    }
    public static String getSwich(int num) {
        switch (num) {
            case 1: 
                return"Fim de semana";
            case 2:
                return"Dia útil";
            case 3:
                return"Dia útil";
            case 4:
                return"Dia útil";
            case 5:
                return"Dia útil";
            case 6:
                return"Dia útil";
            case 7:
                return"Fim de semana";
            default: 
                return"numero inválido";
        }
        
    }
}
