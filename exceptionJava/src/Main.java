import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        //Onde pode conter uma exeções
        try {
            String[] vect = ent.nextLine().split(" ");
            int position = ent.nextInt();
            System.out.println(vect[position]);
        }

        //Bloco responsável caso tenha uma exeção
        //Caso digite uma posição que não exista
       catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position");
        }

        //Caso ele digite algo fora do programado
        catch (InputMismatchException e){
            System.out.println("Type null");
        }
        //Isso faz com que o programa não quebre

        System.out.println("End of program");


        ent.close();
    }
}