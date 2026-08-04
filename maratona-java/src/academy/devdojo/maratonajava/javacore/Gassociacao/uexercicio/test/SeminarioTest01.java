package academy.devdojo.maratonajava.javacore.Gassociacao.uexercicio.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.uexercicio.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.uexercicio.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.uexercicio.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.uexercicio.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Shiganshina");
        Aluno aluno = new Aluno("Hugo", 22);
        Professor professor = new Professor("Jiraya", "Sapo");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Onde achar gold", local, alunosParaSeminario);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }
}
