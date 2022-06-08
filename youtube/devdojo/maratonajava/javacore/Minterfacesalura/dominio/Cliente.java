package youtube.devdojo.maratonajava.javacore.Minterfacesalura.dominio;

import youtube.devdojo.maratonajava.javacore.Minterfacesalura.servicos.Autenticavel;

public class Cliente implements Autenticavel {
    private int senha;
    private AutenticacaoUtil autenticador;

    public Cliente(AutenticacaoUtil util) {
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
