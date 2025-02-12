import java.util.Scanner;
import java.util.Arrays;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("$ ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String typeSubString;
        String[] commands = {"exit", "echo", "type"};


        //The invalid command loop
        /*while (!input.matches("")) {
            System.out.println(input + ": command not found");
            System.out.print("$ exit ");
            input = scanner.nextLine();
        }
        scanner.close();*/

        //The exit command
        while (true) {

            if(input.equals("exit " + 0)) {
                System.exit(0);
            }
            else if (input.startsWith("echo")) {
                System.out.println(input.substring(5));
            }
            else if (input.startsWith("type")) {
                typeSubString = input.substring(5);
                if (Arrays.asList(commands).contains(typeSubString)) {
                    System.out.println(typeSubString + " is a shell builtin");
                }
                else {
                    System.out.println(typeSubString + " not found");
                }
            }
            else {
                System.out.println(input + ": command not found");
            }

            System.out.print("$ ");
            input = scanner.nextLine();

        }

    }

}
