import java.util.Scanner;

public class lab3_pb4 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number of words: ");
            int n = input.nextInt();
            input.nextLine();
            String[] words = new String[n];
            System.out.println("Enter " + n + " words:");
            for (int i = 0; i < n; i++) {
                words[i] = input.nextLine();
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (words[j].compareTo(words[j + 1]) > 0) {
                        String temp = words[j];
                        words[j] = words[j + 1];
                        words[j + 1] = temp;
                    }
                }
            }

            System.out.println("In the lexicographical order:");
            for (String word : words) {
                System.out.println(word);
            }
        }
    }

