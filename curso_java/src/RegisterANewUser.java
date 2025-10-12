import java.util.Scanner;
import entities.Person;
import entities.enums.Status;

public class RegisterANewUser extends Person{
    private String email;
    private String doc;

    public RegisterANewUser(){}

    public RegisterANewUser(String NewName, int NewAge, String email, String doc){
        super(NewName,NewAge);
        this.email = email;
        this.doc = doc;
    }

    public void Register(){
        Scanner sc = new Scanner(System.in);


        System.out.print("Digited your name: ");
        String name = sc.nextLine();
        setName(name);

        System.out.print("Digited your age: ");
        int age = sc.nextInt();
        setAge(age);

        sc.nextLine();

        System.out.print("Digited email: ");
        email = sc.nextLine();

        System.out.print("Digited your document of identification: ");
        doc = sc.nextLine();
    }

    public String toString(){
        return "Your name: " + getName() + "\n"
                + "Your age: " + getAge() + "\n"
                + "Your email: " + email + "\n"
                + "Your document: " + doc + "\n"
                + "Situation of your account: " + Status.OK;
    }
}
