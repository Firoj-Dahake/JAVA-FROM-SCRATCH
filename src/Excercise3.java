import java.util.Scanner;

public class Excercise3 {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String str = scanner.nextLine();

            int[] counts = new int[26];

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    int serialNumber = ch - 'A';
                    counts[serialNumber]++;
                }

            }
        }
    }

