import java.util.Scanner;

public class DesafioL {
    public static void main(String[] args) {
        /* Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago,
         conforme a escolha da forma de pagamento
        pelo comprador e imprima na tela o valor final do produto a ser pago.
         Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
        Tabela de Código de Condições de Pagamento

        1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto

        2 - À Vista no cartão de crédito, recebe 10% de desconto

        3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros

        4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%*/

        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor de um produto");
        double produtoValor = input.nextDouble();
        System.out.println("Selecione a forma de pagamento:");
        System.out.println("1 - Á VISTA DINHEIRO OU PIX, 15% DESCONTO");
        System.out.println("2 - Á VISTA CARTÃO OU PIX, 10% DESCONTO");
        System.out.println("3 - PARCELADO NO CARTÃO EM DUAS VEZES, PREÇO NORMAL SEM JUROS");
        System.out.println("4 - PARCELADO NO CARTÃO EM TRÊS VEZES OU MAIS, PREÇO NORMAL DO PRODUTO MAIS JUROS DE 10%");
        int formaPagamento = input.nextInt();
        if(formaPagamento == 1){
            double desconto = produtoValor * 0.15;
            double valorFinal = produtoValor - desconto;
            System.out.println("Valor total:"+valorFinal);
        } else if (formaPagamento == 2) {
            double desconto = produtoValor * 0.1;
            double valorFinal = produtoValor - desconto;
            System.out.println("Valor total:"+valorFinal);
        } else if (formaPagamento == 3) {
            System.out.println("Valor total:"+produtoValor);
        }else {
            double desconto = produtoValor * 0.10;
            double valorFinal = produtoValor + desconto;
            System.out.println("Valor total:"+valorFinal);
        }
    }
}
