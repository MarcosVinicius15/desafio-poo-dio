import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso python");
        curso2.setDescricao("descrição curso python");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria POO");
        mentoria.setDescricao("conhecimentos básicos de POO.");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marcos: \n\t" + devMarcos.getConteudoInscritos() + "\n");

        devMarcos.progredir();
        devMarcos.progredir();

        System.out.println("Conteúdos Inscritos Marcos: \n\t" + devMarcos.getConteudoInscritos() + "\n");
        System.out.println("Conteúdos Concluídos Marcos: \n\t" + devMarcos.getConteudosConcluidos() + "\n");
        System.out.println("XP: " + devMarcos.calcularTotalXp() + "\n");

        Dev devVitor = new Dev();
        devVitor.setNome("Vitor");
        devVitor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Vitor: \n\t" + devVitor.getConteudoInscritos() + "\n");

        devVitor.progredir();
        devVitor.progredir();
        devVitor.progredir();

        System.out.println("Conteúdos Inscritos Vitor: \n\t" + devVitor.getConteudoInscritos() + "\n");
        System.out.println("Conteúdos Concluídos Vitor: \n\t" + devVitor.getConteudosConcluidos() + "\n");
        System.out.println("XP: " + devVitor.calcularTotalXp() + "\n");




    }
}