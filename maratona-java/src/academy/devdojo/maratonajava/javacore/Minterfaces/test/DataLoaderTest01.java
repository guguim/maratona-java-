package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        databaseLoader.remove();
        System.out.println("=========================");
        fileLoader.remove();
        fileLoader.load();
        System.out.println("=========================");
        databaseLoader.checkPermission();
        fileLoader.checkPermission();
        System.out.println("=========================");
        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();

    }
}
