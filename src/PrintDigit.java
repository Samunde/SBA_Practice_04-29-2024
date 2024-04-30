import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PrintDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter your String: ");
        String s = sc.nextLine();
//
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {
                counter=counter+1;

                System.out.print("Number " + counter + " is: "  + s.charAt(i)+"\n");

            }

        }
    }}

