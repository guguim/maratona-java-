package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        byte dia = 5;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Dia inválido");
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
            default:
                System.out.println("Sexo Invalido");
        }

    }
}
