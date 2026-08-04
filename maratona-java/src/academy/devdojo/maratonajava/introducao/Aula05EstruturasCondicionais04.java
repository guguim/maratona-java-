package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {

        double salario = 70000;

        if (salario <= 34712 ) {
            salario = salario - (salario * 0.097);
        } else if (salario >= 34713 && salario <= 68507) {
            salario = salario - (salario * 0.3735);
        } else {
            salario = salario - (salario * 0.4950);
        }
        System.out.println("O seu salário é de: " + salario);

    }
}
