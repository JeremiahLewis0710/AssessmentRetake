import java.util.Scanner;

/**
 * Created by lrterry on 10/13/16.
 */
public class Question10 {
    public static void main(String[] args) {
        System.out.println("Enter a character: ");

        Scanner scanner = new Scanner(System.in);
        char s = scanner.next().charAt(0);

        System.out.print(s + " is" + (isVowel(s) ? " " : " not ") + "a vowel");
    }

    public static boolean isVowel(char s) {
        if(s=='a'||s=='e'|| s=='i'||s=='o'|| s =='u'){
            return true;
        }

        return false;
    }
}


