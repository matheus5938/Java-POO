public class CreatANewProduct {
    private String product;
    private double price;
    private int quantity;

    //Neste programa fiz encapsulamento e o construtor

    public CreatANewProduct(String product, double price, int quantity){
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public double ValueStock() {
        return price * quantity;
    }

    public void setProduct(String product){
        this.product = product;
    }

    public String getProduct(){
        return product;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public String toString(){
        return "Product => " + product + "\n"
                + "Price => " + price + "\n"
                + "Quantity in stock => " + quantity + "\n"
                + "Value in merchandise => " + ValueStock();
    }
}
