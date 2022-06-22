package aluraplataforma.MtddEJavaTestesComJunit.CconhecendoTdd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Funcionario {
    String nome;
    BigDecimal salario;
    LocalDate dataAdmissao;

    public String getNome() {
        return nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }
    public BigDecimal getSalario(){
        return salario;
    }

    public Funcionario(String nome, LocalDate dataAdmissao, BigDecimal bigDecimal) {

    }

    public void reajustarSalario(BigDecimal reajuste) {
       this.salario = this.salario.add(reajuste).setScale(2, RoundingMode.HALF_UP);

    }


}
