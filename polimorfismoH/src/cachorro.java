public class cachorro extends Animal{
    private String late = "Au au";

    public cachorro(){}

    public cachorro(String name, String raca, String late){
        super(name,raca);
        this.late = late;
    }

    public String getLate() {
        return late;
    }

    @Override
    public void barulo() {
        System.out.println(getName() + " " + late);
    }
}
