public class gato extends Animal{
    private String mia = "Gato mia";

    public gato(){}

    public gato(String name, String raca, String mia){
        super(name, raca);
        this.mia = mia;
    }

    @Override
    public void barulo() {
        System.out.println(getName() + " " + mia);
    }

    public String getMia() {
        return mia;
    }
}
