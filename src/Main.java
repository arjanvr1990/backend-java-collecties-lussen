import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

        Translator translator = new Translator(numeric, alphabetic);        // Hier mag je je code schrijven voor de hoofd-opdracht

        boolean play = true;
        String ongeldig = "ongeldige invoer";
        Scanner scanner = new Scanner(System.in);


        while (play) {
            // Print opties
            System.out.println("Type 'x' om te stoppen");
            System.out.println("Type 'v' om te vertalen");

            // Lees de input van de gebruiker
            String input = scanner.nextLine();

            if (input.equals("x")) {
                play = false;
            } else if (input.equals("v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                int number = scanner.nextInt();
                scanner.nextLine(); // voeg deze toe om de newline te consumeren
                if (number < 10) {
                    String result = translator.translate(number);
                    System.out.println("De vertaling van " + number + " is " + result);
                } else {
                    System.out.println(ongeldig);
                }
            } else {
                System.out.println(ongeldig);
            }
        }
    }
}
