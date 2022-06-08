package youtube.devdojo.maratonajava.introducao;

public class Aula06_EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        //dado um valor de um caroo, descubra em quantas parcelas ele pode ser parcelado;
        //condição valorParcela >= 1000;

        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcela " +parcela +" R$ " +valorParcela);
        }
    }
}
