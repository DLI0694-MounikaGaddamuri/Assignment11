package CopyFile;

import java.io.*;

public class CopyFileContent
{
    public static void main(String[] args) throws IOException {

        try(FileReader file = new FileReader("src/CopyFile/source.txt")) {
            try (FileWriter fw = new FileWriter("src/CopyFile/Destination.txt")) {
                int i = 0;
                while ((i = file.read()) != -1) {
                    fw.write((char) i);
                }
                //fw.close();
            }catch(IOException e){System.out.println(e);}
        }catch (IOException ex) {throw new RuntimeException(ex);}
        System.out.println("Completed!");
    }
}