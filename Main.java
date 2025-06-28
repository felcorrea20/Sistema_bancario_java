import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double saldoBancario = 0;
        int escolha;

        System.out.println("*************************");
        System.out.println("Dados do cliente:");
        System.out.println();
        System.out.println("Nome: Felipe Corrêa");
        System.out.printf("Saldo: R$ %.2f", saldoBancario);
        System.out.println();
        System.out.println("*************************");

        String menu = """
                    ======= MENU =======
                    [1] Consultar saldo
                    [2] Realizar saque
                    [3] Depositar valor
                    [4] Sair
                    """;

        do {
            System.out.println( );
            System.out.println(menu);
            System.out.print("Escolha uma opção: ");
            escolha = leitor.nextInt();
            System.out.println();

            switch (escolha) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f", saldoBancario);
                    break;

                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double saque = leitor.nextDouble();

                    if (saque < saldoBancario) {
                        saldoBancario -= saque;
                        System.out.printf("Saldo atualizado: R$ %.2f", saldoBancario);
                    } else {
                        System.out.println("Não há saldo suficiente para saque ");
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor do depósito: ");
                    double deposito = leitor.nextDouble();

                    saldoBancario += deposito;

                    System.out.printf("Saldo atualizado: R$ %.2f", saldoBancario);
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while (escolha != 4);
    }
}
