import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("$ ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //The invalid command loop
        /*while (!input.matches("")) {
            System.out.println(input + ": command not found");
            System.out.print("$ exit ");
            input = scanner.nextLine();
        }
        scanner.close();*/

        //The exit command
        while (!input.matches("")) {

            if(input.equals("0")) {
                scanner.close();
            }
            else {
                System.out.println(input + ": command not found");
                System.out.print("$ exit ");
                input = scanner.nextLine();
            }

        }
    }

}
