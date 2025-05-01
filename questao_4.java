// Imports
import java.util.Scanner;


// Classe principal
public class questao_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cadastro de Conta Corrente ---");
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()
        System.out.print("Digite o nome do titular: ");
        String titularConta = scanner.nextLine();

        ContaCorrente conta = new ContaCorrente(numeroConta, titularConta);
        System.out.println("\nConta criada com sucesso!");

        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para sacar: R$");
                    float valorSaque = scanner.nextFloat();
                    conta.sacar(valorSaque);
                    break;
                case 2:
                    System.out.print("Digite o valor para depositar: R$");
                    float valorDeposito = scanner.nextFloat();
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.println("Saldo atual: R$" + String.format("%.2f", conta.consultarSaldo()));
                    break;
                case 4:
                    System.out.println("Saindo do programa. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}