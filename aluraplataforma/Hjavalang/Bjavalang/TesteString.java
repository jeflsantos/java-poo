package aluraplataforma.Hjavalang.Bjavalang;

public class TesteString {
    public static void main(String[] args) {

        String nome = "Mario"; //object literal
        String outro = new String("Alura"); //má prática, sempre prefere a sintaxe literal

        String novo = outro.replace("A", "a");

        System.out.println(novo);

        String novo1 = nome.toLowerCase(); //também teste toUpperCase()

        System.out.println(novo1);

        char c = nome.charAt(3); //char i
        System.out.println(c);

        int pos = nome.indexOf("rio");
        System.out.println(pos);

        for(int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        String sub = nome.substring(1);
        System.out.println(sub);
    }
}
