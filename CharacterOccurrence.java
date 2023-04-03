import java.util.Scanner;

public class CharacterOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input string from user
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Read input character from user
        System.out.print("Enter a character: ");
        char c = scanner.next().charAt(0);

        // Count the number of occurrences
        int count = countOccurrences(str, c);

        // Display the result
        System.out.println("The character '" + c + "' appears " + count + " times in the string.");
    }

    public static int countOccurrences(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
