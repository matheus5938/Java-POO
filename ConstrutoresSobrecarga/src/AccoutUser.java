public class AccoutUser extends Accout{
    private String doc;
    private String eti;

    public AccoutUser(){}

    public AccoutUser(String name, int age, String doc, String eti){
        super(name,age);
        this.doc = doc;
        this.eti = eti;
    }

    //Aqui eu faço a sobreposição
    //Usando a anotação @Override para usar o metodo da classe pai(super class)
    //Esta anotação @Override diz para o compilador e programador que aqui ouve uma sobreposição
    @Override
    public void welcome() {
        super.welcome();
    }

    public String getDoc() {
        return doc;
    }

    public String getEti() {
        return eti;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public void setEti(String eti) {
        this.eti = eti;
    }

    public String toString(){
        return "Account user: " + getName() + "\n"
                + "Age user: " + getAge() + "\n"
                + "Document of user: " + doc + "\n";
    }
}
