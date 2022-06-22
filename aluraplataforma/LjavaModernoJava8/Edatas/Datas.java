package aluraplataforma.LjavaModernoJava8.Edatas;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate copa = LocalDate.of(2023, Month.SEPTEMBER, 21);
        int  anos = copa.getYear() - hoje.getYear();
        System.out.println(anos);

        Period periodo = Period.between(hoje, copa);
        System.out.println(periodo.getDays());

        LocalDate proximaCopa = copa.plusYears(4);
        System.out.println(proximaCopa);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorFormatado = proximaCopa.format(formatador);
        System.out.println(valorFormatado);

        DateTimeFormatter formatadorHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorHoras));

        LocalTime intervalo = LocalTime.of(15, 30);
        System.out.println(intervalo);


    }
}
