import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        Animal gato = new gato();
        Animal cachorro = new cachorro();

        cachorro.setName("Rex");
        cachorro.comer();
        cachorro.barulo();

        gato.setName("Tom");
        gato.comer();
        gato.barulo();

        ent.close();
    }
}