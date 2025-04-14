import java.util.Scanner;

public class DesafioE {
    public static void main(String[] args) {
        /*Faça um algoritmo que leia o valor do salário mínimo e o
        valor do salário de um usuário, calcule quantos salários mínimos esse
        usuário ganha e imprima na tela o resultado.
        (Base para o Salário mínimo R$ 1.293,20).*/

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor do salário:");
        double salario = input.nextFloat();
        double salarioMinimo = 1293.20;
        int qntSalarios = (int) salario/(int)salarioMinimo;
        System.out.println("O usuário ganha "+qntSalarios+" salarios minimos");

    }
}
