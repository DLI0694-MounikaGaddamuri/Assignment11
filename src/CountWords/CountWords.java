package CountWords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {
    public static void main(String[] args) {
        try{
            File file = new File("src/CountWords/ text_file.txt");
            if(file.createNewFile())
                System.out.println(file.getName()+" created");
        }catch(IOException e){e.printStackTrace();}

        String[] array={" "};
        try{BufferedReader bf = new BufferedReader(new FileReader("src/CountWords/ text_file.txt"));
            String line;
            int count=0;
            while((line=bf.readLine())!=null){
                    array=line.split("[ \\n]+");
                    count+= array.length;

            }
            System.out.println("Number of words in the file is: "+ count);
        }catch(IOException e){System.out.println(e);}


    }
}
