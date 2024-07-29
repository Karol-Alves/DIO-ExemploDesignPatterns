import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

    private Conta conta = new Conta();
    private Scanner scanner = new Scanner(System.in);
    private OperacaoFactory operacaoFactory = new OperacaoFactory();

    public String dadosCliente() {
        System.out.println("Digite o número da conta: ");
        String numeroConta = scanner.next();

        System.out.println("Digite a agência com dígito: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", Conta: " + numeroConta + " e seu saldo de R$" + conta.getSaldo() + " já está disponível para saque";

        return mensagem;
    }


    public void exibirMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Depósito");
        System.out.println("2. Transferência");
        System.out.println("3. Saldo");
        System.out.println("4. Sair");
    }

    public void menu() {
        int opcaoCliente;
        BigDecimal valor;

        while (true) {
            exibirMenu();
            opcaoCliente = scanner.nextInt();

            if (opcaoCliente == 4) {
                System.out.println("Obrigado por usar nosso sistema.");
                scanner.close();
                break;
            }

            if (opcaoCliente == 1 || opcaoCliente == 2) {
                System.out.print("Digite o valor: ");
                valor = new BigDecimal(scanner.next());
            } else {
                valor = BigDecimal.ZERO;
            }

            try {
                Operacao operacao = operacaoFactory.criarOperacao(opcaoCliente);
                operacao.executar(conta, valor);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
