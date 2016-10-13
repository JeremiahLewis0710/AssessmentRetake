/**
 * Created by lrterry on 10/13/16.
 */
public class Question6 {
    public static void main(String[] args) {
        //What's the difference between private, public, protected, default?
        //Write your answer below

         String publicAnswer = "Public is a value that can be used anywhere in the entire project";
         String privateAnswer = "Can only be used in the class it was created in";
         String protectedAnswer = "Can only be used within the package";
        String defaultAnswer = "There is no specific value attached to this";

        System.out.println(publicAnswer);
        System.out.println(privateAnswer);
        System.out.println(protectedAnswer);
        System.out.println(defaultAnswer);
    }
}
