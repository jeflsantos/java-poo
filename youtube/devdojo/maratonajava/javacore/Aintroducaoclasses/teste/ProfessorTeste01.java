package youtube.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import youtube.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {

        Professor professor = new Professor();

        professor.nome = "Julio";
        professor.idade = 55;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
