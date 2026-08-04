package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    int MAXA_DATA_SIZE = 10;
    void load();

    default void checkPermission(){
        System.out.println("Realizando checagem de permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxaDataSize");
    }

}
