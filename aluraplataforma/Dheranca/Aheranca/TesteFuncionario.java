package aluraplataforma.Dheranca.Aheranca;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario jeff = new Funcionario();

        jeff.setNome("Jefferson Luis");
        jeff.setCpf("111.222.333-99");
        jeff.setSalario(2500.00);

        System.out.println(jeff.getNome());
        System.out.println(jeff.getBonificacao());
    }
}
