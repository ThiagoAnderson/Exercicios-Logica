import java.util.Scanner;

public class DesafioD {
    public static void main(String[] args) {
        /*Faça um algoritmo que receba um número
        inteiro e imprima na tela o seu antecessor e o seu sucessor.*/

        int num;

        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número para verificação:");
        num = input.nextInt();

        int numAntecesor = num -1;
        int numSucessor = num +1;
        System.out.println("Numero: "+ num);
        System.out.println("Numero Antecessor: "+ numAntecesor);
        System.out.println("Numero Sucessor: "+ numSucessor);

    }
}
