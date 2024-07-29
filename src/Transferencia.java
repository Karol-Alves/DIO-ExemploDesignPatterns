import java.math.BigDecimal;

public class Transferencia implements Operacao {
    @Override
    public void executar(Conta conta, BigDecimal valor) {
        if (valor.compareTo(conta.getSaldo()) <= 0) {
            conta.setSaldo(conta.getSaldo().subtract(valor));
            System.out.printf("Saldo atualizado: R$ %.2f\n", conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para a transferência.");
        }
    }
}