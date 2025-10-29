import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String path = "C:\\Users\\Dell\\Documents\\text.txt";

        FileReader fr = null;
        BufferedReader br = null;

        //Aqui é para ler o qe esta no arquivo da var path
        try {
            fr = new FileReader(path);
            //Chamando a Buffered faz com que a leitura do arquivo seja mais rápida
            //Deixando mais fluido
            br = new BufferedReader(fr);
            //Também daria certo se fosse
            //br = new BufferedReader(new FileReader(path));

            String line = br.readLine();
            //Se o arquivo estiver no final o readLine vai retornar null

            //Este é a forma básica de ler um arquivo com o BufferedRead
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("ERRO: " + e.getMessage());
        }
        finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}