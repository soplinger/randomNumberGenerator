import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {

        int num, amt;
        String userInput;
        Scanner kbInput = new Scanner(System.in);
        Random rndm = new Random();
        boolean runRndm = true;

        while(runRndm = true){
            System.out.println("Would you like to run the test 100, 1000, or  10000 times?");
            userInput = kbInput.next();

            int numArray[] = new int[amt];

            if (amt == 100){
                num = rndm.nextInt(101);
                System.out.println(num);
            }



        }
    }
}





