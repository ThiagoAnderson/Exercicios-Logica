import java.util.Scanner;

public class DesafioK {
    public static void main(String[] args) {
        /*Faça um algoritmo que leia quatro notas obtidas por um aluno,
        calcule a média das nota obtidas, imprima na tela o nome do aluno e
        se o aluno foi aprovado ou reprovado. Para o aluno ser
        considerado aprovado sua média final deve ser maior ou igual a 7.*/

        Scanner input = new Scanner(System.in);
        double n1,n2,n3,n4,media;
        System.out.println("Insira o nome do aluno:");
        String aluno = input.nextLine();
        System.out.println("Insira os valores das notas abaixo:");
        System.out.println("Nota um:");
        n1 = input.nextDouble();
        System.out.println("Nota dois:");
        n2 = input.nextDouble();
        System.out.println("Nota três:");
        n3 = input.nextDouble();
        System.out.println("Nota quatro:");
        n4 = input.nextDouble();
        media = (n1+n2+n3+n4)/4;
        if(media < 7.0){
            System.out.println("Aluno: "+aluno+" ,Status: Reprovado");
        }else {
            System.out.println("Aluno: "+aluno+" ,Status: Aprovado");
        }
    }
}
