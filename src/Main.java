import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLuziano = new Dev();
        devLuziano.setNome("Luziano");
        devLuziano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos Luziano: " + devLuziano.getConteudosInscritos());
        devLuziano.progredir();
        devLuziano.progredir();
        System.out.println("-");
        System.out.println("Conteúdo Incritos Luziano: " + devLuziano.getConteudosInscritos());
        System.out.println("Conteúdo Concluídos Luziano: " + devLuziano.getConteudosConcluidos());
        System.out.println("XP: " + devLuziano.calcularTotalXp());

        System.out.println("-----------");

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus") ;
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos Matheus: " + devMatheus.getConteudosInscritos());
        devMatheus.progredir();
        devMatheus.progredir();
        devMatheus.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Matheus: " + devMatheus.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Matheus: " + devMatheus.getConteudosConcluidos());
        System.out.println("XP: " + devMatheus.calcularTotalXp());
    }
}
