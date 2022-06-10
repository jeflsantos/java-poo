package aluraplataforma.Fpolimorfismo;

public class Gerente extends Funcionario {

    private int senha;


    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getBonificacao() {
        return super.getBonificacao() + super.getSalario();
    }


    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
