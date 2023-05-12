import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Sintaxe básica Java");
        curso1.setDescricao("Sintaxe básica da linguagem Java");
        curso1.setCargaHoraria(3);

        Curso curso2 = new Curso();
        curso2.setTitulo("OO com Java");
        curso2.setDescricao("Orientação a objeto com Java");
        curso2.setCargaHoraria(5);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Como não se desesperar diante de prazos impossíveis");
        mentoria1.setDescricao("Essa mentoria vai ensinar como não se desesperar diante de prazos impossíveis");
        mentoria1.setData(LocalDate.now().plusDays(2L));


        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devManoel = new Dev();
        devManoel.setNome("Manoel");
        devManoel.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos de Manoel: " + devManoel.getConteudoInscritos());
        System.out.println("Conteudos concluidos de Manoel: " + devManoel.getConteudoConcluidos());
        System.out.println("XP: " + devManoel.calcularTotalXp());

        Dev devJoe = new Dev();
        devJoe.setNome("Joe");
        System.out.println("Conteudos inscritos de Joe: " + devJoe.getConteudoInscritos());
        devJoe.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos de Joe: " + devJoe.getConteudoInscritos());
        System.out.println("Conteudos concluidos de Joe: " + devJoe.getConteudoConcluidos());
        devJoe.progredir();
        System.out.println("Conteudos inscritos de Joe: " + devJoe.getConteudoInscritos());
        System.out.println("Conteudos concluidos de Joe: " + devJoe.getConteudoConcluidos());
        System.out.println("XP: " + devJoe.calcularTotalXp());
        devJoe.progredir();
        devJoe.progredir();
        System.out.println("Conteudos inscritos de Joe: " + devJoe.getConteudoInscritos());
        System.out.println("Conteudos concluidos de Joe: " + devJoe.getConteudoConcluidos());
        devJoe.progredir();



    }




}
