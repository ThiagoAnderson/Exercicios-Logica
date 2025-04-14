import java.util.Scanner;

public class DesafioN {
    public static void main(String[] args) {
        /*Faça um algoritmo que receba um valor A e B, e troque o valor de A por
         B e o valor de B por A e imprima na tela os valores.*/

        Scanner input = new Scanner(System.in);
        int A,B,C;
        System.out.println("Valor A:");
        A = input.nextInt();
        System.out.println("Valor B:");
        B = input.nextInt();
        C = A;
        A = B;
        B = C;
        System.out.println("Valor de A:"+A);
        System.out.println("Valor de B:"+B);
    }
}
