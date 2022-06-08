package youtube.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import youtube.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Civic";
        carro1.modelo = "Sport";
        carro1.ano = 2011;

        carro2.nome = "Chevet";
        carro2.modelo = "Sport";
        carro2.ano = 1980;

        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
        System.out.println("\n--------------\n");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);


    }
}
