import java.math.BigDecimal;

public class ConsultaSaldo implements Operacao {
    @Override
    public void executar(Conta conta, BigDecimal valor) {
        System.out.printf("Saldo disponível: R$ %.2f\n", conta.getSaldo());
    }
}