import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        Accout accout = new Accout();
        AccoutUser accoutUser = new AccoutUser();

        accout = accoutUser;

        accoutUser.setName("User test");
        accoutUser.setAge(20);
        accoutUser.setDoc("12345678");

        System.out.println("Accout user: \n" + accoutUser.toString());
        //aqui eu chamo o método da classe pai pelo filho, pois usei o @Override e sobreposição
        accoutUser.welcome();

        System.out.println("\n");

        AccoutPla accoutPla = new AccoutPla();

        accout = accoutPla;

        accoutPla.setCnpj("XX. XXX. XXX/0001-XX");
        accoutPla.setCompanyName("Enterprise");
        accoutPla.setName("Name founder");
        accoutPla.setAnnualValue(00000);

        System.out.println("Company account: \n" + accoutPla.toString());
        }
    }
