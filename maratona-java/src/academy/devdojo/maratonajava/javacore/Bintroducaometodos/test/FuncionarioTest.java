package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNome("Sanji");
        funcionario1.setIdade(18);
        funcionario1.setSalarios(new double[]{1500,1726,1263});
        funcionario1.imprimir();
        funcionario1.media();

        System.out.println("média: " + funcionario1.getMedia());
    }
}
