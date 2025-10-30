import entities.User;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};


        String path = "C:\\Users\\Dell\\Documents\\userTest.txt";

        String name = "João";
        String age = "19";



        //Para eu não recriar o arquivo e somente adicionar novamente ou de novo é só colocar o true do lado do path
        //Ou do lado do outro parâmetro
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){


            bw.write(name);
            bw.newLine();
//            for (String line : lines){
//                //O write diz o que escrever no arquivo
//                bw.write(line);
//                bw.newLine();
//            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("OK");
    }
}