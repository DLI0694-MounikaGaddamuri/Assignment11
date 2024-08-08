import java.util.*;
public class Reverse {

    public static String reverseString(String str){
        String reversed_string="";
        for(int i=str.length()-1;i>=0;i--)
            reversed_string+=str.charAt(i);
        return reversed_string;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a line: ");
        String line = input.nextLine();
        String[] array= line.split(" ");
        System.out.println(Arrays.toString(array));
        for(int i=0;i< array.length;i++) {
            array[i] =reverseString(array[i]);
        }
        System.out.println(Arrays.toString(array));

        for(int i= array.length-1;i>=0;i--)
            System.out.println(array[i]);
    }
}
