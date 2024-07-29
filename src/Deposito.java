import java.math.BigDecimal;

public class Deposito implements Operacao {
    @Override
    public void executar(Conta conta, BigDecimal valor) {
        conta.setSaldo(conta.getSaldo().add(valor));
        System.out.printf("Saldo atualizado: R$ %.2f\n", conta.getSaldo());
    }
}