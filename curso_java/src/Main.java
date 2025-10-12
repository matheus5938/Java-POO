import entities.enums.Status;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {//Classe
    public static void main(String[] args) {//Entre point a função que será executada primeiro
        ArrayList<String> ListName = new ArrayList<>();
        Scanner ent = new Scanner(System.in);
        RegisterANewUser user = new RegisterANewUser();

        System.out.println("Choice a option: \n(1).Register a new user\n (2).Create a new car");
        int choice = ent.nextInt();

        if (choice == 1) {
            user.Register();
            System.out.println("\n");
            System.out.println(user.toString());

            for (int i=0; i<2; i++){
                System.out.println(user.toString());
            }
        }
        else if (choice == 2){}
        else{
            System.out.println("Status of account: " + Status.NO + " Choice a option ");
        }

//        System.out.println(Status.YES);

        ent.close();
    }
}