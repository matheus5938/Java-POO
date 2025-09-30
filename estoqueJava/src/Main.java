import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        ArrayList<String> Product = new ArrayList<>();

        //CreatANewProduct np = new CreatANewProduct();
        System.out.print("Name: ");
        String product = ent.nextLine();

        System.out.print("Price: ");
        double price = ent.nextDouble();

        System.out.print("Quantity: ");
        int quantity = ent.nextInt();


        CreatANewProduct np = new CreatANewProduct(product,price,quantity);

        System.out.println("Product registered: " + np.toString());

        ent.close();
    }
}