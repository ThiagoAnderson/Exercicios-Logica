import java.util.Scanner;

public class DesafioJ {
    public static void main(String[] args) {
        /*Faça um algoritmo que leia três
        notas obtidas por um aluno, e imprima na tela a média das notas.*/

        Scanner input = new Scanner(System.in);
        double n1,n2,n3,media;
        System.out.println("Insira os valores das notas abaixo:");
        System.out.println("Nota um:");
        n1 = input.nextDouble();
        System.out.println("Nota dois:");
        n2 = input.nextDouble();
        System.out.println("Nota três:");
        n3 = input.nextDouble();
        System.out.println("Média das notas:");
        media = (n1+n2+n3)/3;
        System.out.println(media);

    }
}
