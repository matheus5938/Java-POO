import java.util.Scanner;
public class Product {
    //atributos
    public String name;
    public double price;
    public int quantity;

    //metodos
    public double valueProductsInstock(){
        return price * quantity;
    }

    public void addProduct(int quantity){
        this.quantity += quantity;
    }

    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }

    //metodo toString para imprimir a class transformando-a em string
    public String toString(){
        return name + ", $ " + price + " QTD:" + quantity + ", value stock: $ " + valueProductsInstock();
    }

    public void cadProduct(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        name = sc.nextLine();

        System.out.print("Price: $");
        price = sc.nextDouble();

        System.out.print("QTD: ");
        quantity = sc.nextInt();

        System.out.println(toString());
    }
}