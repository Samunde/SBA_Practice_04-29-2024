import java.util.ArrayList;
import java.util.Random;

public class RandomizingList {
    public static void main(String[] args) {
        String[] names = {"Harold", "James", "John", "Andrew", "Philip", "Matthew", "Thomas", "Simon"};
        Random rand = new Random();
        String rString=names[rand.nextInt(names.length)];
        ArrayList list = new ArrayList();
//        list.add(rString);
        for(int i=0; i< names.length; i++){
            list.add(names[rand.nextInt(names.length)]);
        }
//
//        }
        System.out.println("Your Random String is: "+list);
    }
}
