import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class PasswordCombinations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();
//        ArrayList<String> passwordCombinations = new ArrayList<String>();
        char[] chars = password.toCharArray();
        int length = password.length();
//        System.out.println(chars);
//        System.out.println(length);
        for (int i = 0; i < length; i++) {
            if ((Character.isLetter(chars[i]))) {
                System.out.print("Your password contains a letter");
//                continue;
            }else if (Character.isDigit(chars[i])) {
                System.out.println("Your Answer: "+chars[i]);
            }
//            System.out.println(chars[i]);
        }




//        for (int i = 0; i < length; i++) {
//            if ((length >= 1 && length <= 4)) {
//                if ((Character.isDigit(chars[i])) == true) {
//
//                    passwordCombinations.add(String.valueOf(chars[i]));
//                } else {
//                    System.out.println("Your password is incorrect ");
//                }
//             if ((Character.isLetter(chars[i])) == true) {
//                    System.out.println("Your password is incorrect ");
//                }
//                else {
//                 System.out.println("your password is correct ");
//            }
//        }
//    }System.out.println("your correct password is " + passwordCombinations);
//    }}
    }}