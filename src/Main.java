public class Main {
    public static void main(String[] args) {
        ContaTerminal contaTerminal = new ContaTerminal();
        String mensagem = contaTerminal.dadosCliente();
        System.out.println(mensagem);
        contaTerminal.menu();
    }
}
