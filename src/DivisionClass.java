import java.util.Arrays;
import java.util.Scanner;

public class DivisionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s = sc.nextLine();

        int arr[]=new int[s.length()];

        int counter=0;
        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {


//                System.out.print("Number " + counter + " is: "  + s.charAt(i)+"\n");

                arr[counter]=Character.getNumericValue(s.charAt(i));
                counter++;


            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
