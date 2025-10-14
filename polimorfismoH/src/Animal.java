public class Animal {
    private String name;
    private String raca;

    public Animal(){}

    public Animal(String name, String raca){
        this.name = name;
        this.raca = raca;
    }

    public void comer(){
        System.out.println(name + " Comeu");
    }

    public void barulo(){
        System.out.println(name + " Fez algum barulho: ");
    }

    public String getName() {
        return name;
    }

    public String getRaca() {
        return raca;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
