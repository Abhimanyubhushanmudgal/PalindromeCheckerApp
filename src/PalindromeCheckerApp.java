
import java.util.Scanner;

public class PalindromeCheckerApp {


    // Node class for singly linked list
    interface PalindromeStrategy{
        boolean check(String input);
    }

    static class SimpleStrategy implements PalindromeStrategy{

        public boolean check(String input){

            int start=0;
            int end=input.length()-1;

            while(start<end){

                if(input.charAt(start)!=input.charAt(end))
                    return false;

                start++;
                end--;
            }

            return true;
        }
    }
    public static void main(String[] args) {

        PalindromeStrategy strategy = new SimpleStrategy();
        System.out.println(strategy.check("madam"));



    }
}
