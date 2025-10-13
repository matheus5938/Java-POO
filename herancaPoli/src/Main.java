import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        //Aqui eu estou criando um animal
        Animal animal = new Animal();
        Cachorro rex = new Cachorro();
        //aqui eu crio outro animal
        Gato gato= new Gato();
        //Aqui eu crio outro animal
        Cavalo cavalo = new Cavalo();

        //O animal vai receber o rex, ou seja eu vou criar um animal
        //Ou seja a subclasse terá acesso somente aos membros da classe pai
        animal = rex;
        animal = gato;
        animal = cavalo;

        rex.nome = "Rex";
        rex.raca = "Dogo Argentino";

        gato.nome = "fofo";
        gato.raca = "Sem";

        cavalo.nome = "Buck";
        cavalo.raca = "Holandes";

        System.out.println("O cachorro é da raça: " + rex.raca + " e o " + rex.raca + " " + rex.nome);
        System.out.println("Nome do gato: " + gato.nome);
        System.out.println("Nome do cavalo: " + cavalo.nome);

        gato.darComida(gato);

        rex.darComida(rex);

        cavalo.darComida(cavalo);

        ent.close();
    }
}