package youtube.devdojo.maratonajava.introducao;

public class Aula05_EstruturasCondicionaisParte3 {
    public static void main(String[] args) {
        // Doar se salario > 5000;
        double salario = 6000;
        String mensagemDoar = "Eu vou doar pro DevDojo.";
        String mensagemNaoDoar = "Ainda não tenho condições, mas logo vou ter!";
        String resultado;
        if(salario > 5000){
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}
