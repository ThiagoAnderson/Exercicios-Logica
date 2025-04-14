import java.util.Scanner;

public class DesafioM {
    public static void main(String[] args) {
        /*Faça algoritmo que leia o nome e a idade de uma peso e
        imprima na tela o nome da pessoa e se ela é maior ou menor de idade. */

        Scanner input = new Scanner(System.in);
        double peso;
        int idade;
        System.out.println("Insira a sua idade abaixo:");
        idade = input.nextInt();
        System.out.println("Insira seu peso abaixo:");
        peso = input.nextDouble();
        if(idade >= 18){
            System.out.println(idade+" é maior de idade");
        }else{
            System.out.println(idade+" é menor de idade");
        }
    }
}
