package youtube.devdojo.maratonajava.javacore.Minterfacesalura.dominio;

import youtube.devdojo.maratonajava.javacore.Minterfacesalura.servicos.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public Gerente(AutenticacaoUtil util) {
        this.autenticador = util;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);

    }
}