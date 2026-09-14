package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcharTest05 {
    public static void main(String[] args) {

        // \d = Todos os dígitos
        // \D = Tudo o que não for dígitos
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, dígitos, -
        // \W = Tudo o que não for incluso no \w
        //[]
        //? Zero ou Uma
        // * zero ou mais
        // + uma ou mais
        // {n, m} de n até m
        //()
        // |
        // $
        // .
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.@([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com, sakura@mail";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posicoes encontradas");

        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

    }
}
