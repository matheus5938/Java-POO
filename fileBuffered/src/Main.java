import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String strPath = ent.nextLine();

        File path = new File(strPath);

        //Aqui mostra todas as pastas
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("PATH: ");
        for (File folder : folders){
            System.out.println(folder);
        }

        //Aqui lista somente os arquivos
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file);
        }

        //Aqui cria eu tenho o controle de criação de pastas
        boolean success = new File(strPath + "\\newProject").mkdir();
        System.out.println("Directory created successfuly: " + success);

        ent.close();
    }
}