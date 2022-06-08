package youtube.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime (){
        System.out.println(this.nome);
        System.out.println(this.idade);

        for (double salario: salarios) {
            System.out.print(salario + " ");
        }
    }
    public void imprimeMediaSalarial(){
        double media = 0;
        for (double salario: salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMedia salarial " +media);
    }


}
