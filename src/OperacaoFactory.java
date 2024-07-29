public class OperacaoFactory {
    public Operacao criarOperacao(int tipoOperacao) {
        switch (tipoOperacao) {
            case 1:
                return new Deposito();
            case 2:
                return new Transferencia();
            case 3:
                return new ConsultaSaldo();
            default:
                throw new IllegalArgumentException("Operação inválida.");
        }
    }
}
