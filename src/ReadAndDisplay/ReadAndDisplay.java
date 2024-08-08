package ReadAndDisplay;

import java.io.*;

public class ReadAndDisplay {
    public static void main(String[] args) {
        File file = new File("src/ReadAndDisplay/input.txt");
        try{
            file.createNewFile();
            System.out.println("File created");
        }catch(IOException e){System.out.println(e);}

        try(BufferedReader reader = new BufferedReader(new FileReader("src/ReadAndDisplay/input.txt"))){
            String line;
            while((line= reader.readLine())!=null)
                System.out.println(line);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
