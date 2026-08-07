package BS;
import java.util.Scanner;

public class RemoveChar {

    public static String removeCharacter(String str, char ch) {

        char[] arr = str.toCharArray();
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ch) {
                arr[index++] = arr[i];
            }
        }

        return new String(arr, 0, index);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        String result = removeCharacter(str, ch);

        System.out.println("Resulting string: " + result);

        sc.close();
    }
}
