import service.PrintService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = ent.nextInt();

        for (int i = 0; i < n; i++){
            String value = ent.next();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: " + ps.first());

        ent.close();
    }
}