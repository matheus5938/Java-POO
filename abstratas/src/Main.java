import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the of shapes: ");
        int n = ent.nextInt();

        for(int i=1; 1<=n; i++){
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle(r/c)? ");
            char rc = ent.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(ent.next());

            if (rc == 'r'){
                System.out.print("Width: ");
                double widht = ent.nextDouble();
                System.out.print("Height: ");
                double height = ent.nextDouble();
                list.add(new Rectangle(color, widht, height));
            }
            else {
                System.out.print("Radius: ");
                double radius = ent.nextDouble();
                list.add(new Circle(color, radius));
            }

            System.out.println();
            System.out.println("SHAPE AREAS:");
            for(Shape shape : list){
                System.out.println(shape.area());
            }
        }

        ent.close();
    }
}