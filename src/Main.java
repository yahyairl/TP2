import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here

        Trie dico = new Trie();

        File file = new File("/Users/yahyasalim/Downloads/tp2-master/resources/minidico.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            dico.insert(scanner.nextLine());
        }
        scanner.close();

        System.out.println(dico.search("littéralement"));


    }

}
