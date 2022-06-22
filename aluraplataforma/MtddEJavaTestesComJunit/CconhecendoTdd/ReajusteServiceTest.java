package aluraplataforma.MtddEJavaTestesComJunit.CconhecendoTdd;



import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static aluraplataforma.MtddEJavaTestesComJunit.CconhecendoTdd.Desempenho.A_DESEJAR;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

        @Test
        public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar(){
            ReajusteService service = new ReajusteService();
            Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));

            service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
            assertEquals(new BigDecimal("1000.00"), funcionario.getSalario());

        }

}
