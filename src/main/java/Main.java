import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         System.out.print("$ ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
//        System.out.println(input + ": command not found");
        /*do {
            System.out.println(input + ": command not found");
            System.out.print("$ ");
            input = scanner.nextLine();
        } while (!input.matches(""));*/

//        while (System.out.println(input + ": command not found")) {
//            System.out.print("$ exit 0");
//        }
        scanner.close();
    }

}
