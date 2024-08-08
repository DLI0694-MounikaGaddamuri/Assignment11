package UserInput;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.File;
public class UserInputToFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input:");
        String message = input.nextLine();

        try{File file = new File("src/UserInput/user_input");
            System.out.println(file.getName()+" created.");
        }catch (Exception e) {throw new RuntimeException(e);}

        try(FileWriter fw = new FileWriter("src/UserInput/user_input")){
            fw.write(message);
        }catch(IOException e){System.out.println(e);}
    }
}
