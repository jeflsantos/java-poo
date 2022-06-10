package aluraplataforma.Fpolimorfismo;

public class Editor extends Funcionario{
    @Override
    public double getBonificacao() {
        return super.getBonificacao() + 150;
    }
}
