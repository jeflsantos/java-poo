package aluraplataforma.Ijavautil.DvectorEcollection;

import aluraplataforma.Ijavautil.Cequals.Conta;
import aluraplataforma.Ijavautil.Cequals.ContaCorrente;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class TesteArrayList {
    public static void main(String[] args) {

        //List<Conta> lista = new ArrayList<Conta>(); //usa array por baixo
        //List<Conta> lista = new LinkedList<Conta>(); //lista linkada
        Collection<Conta> lista = new Vector<>();

        //outro código omitido
        //...
        Conta ref = ((Vector<Conta>) lista).get(0); //não compila
        //...

    }
}

