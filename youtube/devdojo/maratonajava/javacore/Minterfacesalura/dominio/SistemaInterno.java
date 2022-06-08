package youtube.devdojo.maratonajava.javacore.Minterfacesalura.dominio;

import youtube.devdojo.maratonajava.javacore.Minterfacesalura.servicos.Autenticavel;

public class SistemaInterno {
    private int senha = 2222;

    public void autentica(Autenticavel fa){
        boolean autenticou = fa.autentica(this.senha);
        if(autenticou){
            System.out.println("Acesso ao sistema liberado!");
        }else{
            System.out.println("Acesso ao sistema negado!");
        }
    }
}
