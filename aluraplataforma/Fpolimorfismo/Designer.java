package aluraplataforma.Fpolimorfismo;

import aluraplataforma.Dheranca.Aheranca.Funcionario;

public class Designer extends Funcionario {
    @Override
    public double getBonificacao() {
        return super.getBonificacao() + 200;
    }
}
