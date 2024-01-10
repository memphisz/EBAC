import java.util.Scanner;

public class exemploAnimal {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome de um animal: ");
        String animal = s.nextLine();
        String animalV = getAnimal(animal);
        System.out.println(animalV);
    }
    public static String getAnimal(String animal) {
        //usando o metodo .equals que compara o conteudo do objeto 
        if (animal.equals("dog")) {
            return "O animal é domestico";
        } else if (animal.equals("Lobo")) {
            return "é um animal da floresta";
        } else {
            return "animal desconhecido";
        }
    }
}
