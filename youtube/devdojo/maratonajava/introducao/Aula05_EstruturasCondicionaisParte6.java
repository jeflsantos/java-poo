package youtube.devdojo.maratonajava.introducao;

public class Aula05_EstruturasCondicionaisParte6 {
    public static void main(String[] args) {
        // Utilizando Switch, dados os valores de 1 a 7, imprima se é dia util ou final de semana;
        // Considerando 1 como domingo;

        byte dia = 5;
        switch(dia){
            case 1:
            case 7 :
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
