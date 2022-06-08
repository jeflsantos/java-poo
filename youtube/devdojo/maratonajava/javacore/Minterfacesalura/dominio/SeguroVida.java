package youtube.devdojo.maratonajava.javacore.Minterfacesalura.dominio;

import youtube.devdojo.maratonajava.javacore.Minterfacesalura.servicos.Tributavel;

public class SeguroVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 42;
    }
}
