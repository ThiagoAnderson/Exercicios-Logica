import java.util.Scanner;

public class DesafioF {
    public static void main(String[] args) {
        /* Faça um algoritmo que leia um valor
         qualquer e imprima na tela com um reajuste de 5%.*/

        Scanner input = new Scanner(System.in);
        System.out.println("Insira um valor qualquer para um reajuste de 5%:");
        double valor = input.nextDouble();
        double acrescimo = valor * 0.05;
        System.out.println("O reajuste de 5% tem um valor de : "+acrescimo);

    }
}
