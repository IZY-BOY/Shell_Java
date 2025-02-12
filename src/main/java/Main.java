import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

            if(input.equals("exit 0")) {
                break;
            } else if (input.startsWith("echo")) {
                System.out.println(input.substring(5));
<<<<<<< HEAD
=======
                System.out.print("$ ");
                input = scanner.nextLine();
>>>>>>> 9264ce8c19bf091c1cb1319eaf365c27a40dc08c
            }
            else {
                System.out.println(input + ": command not found");
            }

            System.out.print("$ ");
            input = scanner.nextLine();

        }

    }

}
