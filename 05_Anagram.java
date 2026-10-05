import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String word2 = sc.nextLine();

        char[] arr1 = word1.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] arr2 = word2.toLowerCase().replaceAll("\\s", "").toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The words are Anagrams");
        } else {
            System.out.println("The words are not Anagrams");
        }

        sc.close();
    }
}
