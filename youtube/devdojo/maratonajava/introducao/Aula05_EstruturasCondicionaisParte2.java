package youtube.devdojo.maratonajava.introducao;

public class Aula05_EstruturasCondicionaisParte2 {
    public static void main(String[] args) {
        int idade = 19;
        if(idade < 15){
            System.out.println("Categoria Infantil");
        }else if(idade >= 15 && idade < 18){
            System.out.println("Categoria Juvenil");
        }else{
            System.out.println("Categoria Adulto");
        }
    }
}
