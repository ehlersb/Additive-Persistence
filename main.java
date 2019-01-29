import java.util.Scanner;

/**
 * Created by Benjamin Ehlers on 1/29/2019.
 */
public class main {
    public static void main(String[] args) {
        String input;
        System.out.println("Enter a number to calculate its Additive Persistence");
        System.out.println("Enter '!' to quit.");
        while(true) {
            Scanner scan = new Scanner(System.in);
            input = scan.nextLine();
            if(input.equals("!")) break;
            AdditivePersistence ap = new AdditivePersistence(Long.parseLong(input));
            System.out.println(input + " => " + ap.calculate());
        }
    }
}
