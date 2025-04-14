import java.util.Scanner;

public class DesafioO {
    public static void main(String[] args) {
        /*Faça um algoritmo que leia o ano em que uma pessoa nasceu,
        imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
        consideração o ano com 365 dias e o mês com 30 dias.
        (Ex: 5 anos, 2 meses e 15 dias de vida)*/

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o ano em que você nasceu: ");
        int anoNascimento = input.nextInt();

        int anoAtual = 2025;
        int mesAtual = 4;
        int diaAtual = 14;

        int idadeAnos = anoAtual - anoNascimento;
        int totalDias = idadeAnos * 365 + (mesAtual - 1) * 30 + (diaAtual - 1);

        int anos = totalDias / 365;
        int diasRestantes = totalDias % 365;
        int meses = diasRestantes / 30;
        int dias = diasRestantes % 30;

        System.out.println("Você viveu aproximadamente: " + anos + " anos, " + meses + " meses e " + dias + " dias.");

    }
}
