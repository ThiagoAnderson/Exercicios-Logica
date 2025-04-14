import java.util.Scanner;

public class DesafioG {
    public static void main(String[] args) {
        /*Faça um algoritmo que leia dois valores booleanos (lógicos)
         e determine se ambos são VERDADEIRO ou FALSO*/

        Scanner input = new Scanner(System.in);

        System.out.println("Digite true para verdadeiro e false para falso");
        boolean valorUm = input.nextBoolean();
        System.out.println("Digite true para verdadeiro e false para falso");
        boolean valorDois = input.nextBoolean();
        if (valorUm == true && valorDois == true) {
            System.out.println("Ambos valores verdadeiros");
        } else if (valorUm == false && valorDois == false) {
            System.out.println("Ambos valores falsos");
        }
    }
}
