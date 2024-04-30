import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DivisionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s = sc.nextLine();

        ArrayList<Integer> list=new ArrayList<Integer>();

        int counter=0;
        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {
                list.add(Character.getNumericValue(s.charAt(i)));
            }
        }
        System.out.println(list);
        int div=list.get(0);

        for(int i=1;i<=list.size()-1;i++){
             div=div/(list.get(i));
        }
        System.out.println("Your Division result is: "+div);

    }
}
