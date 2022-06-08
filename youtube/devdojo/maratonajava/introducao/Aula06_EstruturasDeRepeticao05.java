package youtube.devdojo.maratonajava.introducao;

public class Aula06_EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        //dado um valor de um caroo, descubra em quantas parcelas ele pode ser parcelado;
        //condição valorParcela >= 1000;

        double valorTotal = 30000;

        for (int parcela = (int)valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.printf("Parcela " + parcela + " R$ %.2f\n", + valorParcela);
        }

    }
}