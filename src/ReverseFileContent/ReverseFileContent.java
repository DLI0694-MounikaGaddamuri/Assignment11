package ReverseFileContent;

import java.io.*;

public class ReverseFileContent {
    public static void main(String[] args) {
        File file = new File("src/ReverseFileContent/input.txt");
        try{
            file.createNewFile();
            System.out.println(file.getName()+" created.");
        }catch (IOException e) {   throw new RuntimeException(e);}

        try(BufferedReader reader = new BufferedReader(new FileReader(file));
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/ReverseFileContent/destination.txt"))){
            String line,reversed_string;
            while((line=reader.readLine())!=null){
                StringBuilder br = new StringBuilder(line);
                reversed_string=br.reverse().toString();
                //System.out.println(reversed_string);
                writer.write(reversed_string);
                writer.write("\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
