import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {

        int amt;

        Scanner kbInput = new Scanner(System.in);
        System.out.println("Would you like to run the test 100, 1,000, or  10,000 times?");
        amt = kbInput.next();
        int numArray[] = new int[amt];
        int random = (int)Math.random() * amt;
        System.out.println(random);

        if (amt == 100){

        }
        else if (amt == 1000){



        }
        else if (amt == 10000){
    }
}
