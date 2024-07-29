import java.math.BigDecimal;

public interface Operacao {
    void executar(Conta conta, BigDecimal valor);
}
