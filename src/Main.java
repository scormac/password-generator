import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String numbers = "0123456789";
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String symbols = "~`!@#$%^&*()_-+={[}]|\\:;\"'<,>.?/";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the lange of the password");
        int lange = scanner.nextInt();

        char[] password = new char[lange];

        Random random = new Random();
        for (int i = 0; i < lange; i++) {
            int rand = random.nextInt(4);
            switch (rand) {
                case 0:
                    password[i] = randomChar(numbers);
                    break;
                case 1:
                    password[i] = randomChar(capitalLetters);
                    break;
                case 2:
                    password[i] = randomChar(lowercaseLetters);
                    break;
                case 3:
                    password[i] = randomChar(symbols);
                    break;
            }
        }

        System.out.println(password);

    }

    private static char randomChar(String elements) {
        Random random = new Random();
        int index = random.nextInt(elements.length());
        return elements.charAt(index);
    }
}
