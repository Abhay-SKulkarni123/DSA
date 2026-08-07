package Intro;

public class LoopsConditionals {

    public static void main(String[] args) {

        // Variable for demonstration
        int num = 15;

        // ==========================
        // 1. if Statement
        // ==========================
        System.out.println("1. if Statement");
        if (num > 10) {
            System.out.println("Number is greater than 10");
        }

        // ==========================
        // 2. if-else Statement
        // ==========================
        System.out.println("\n2. if-else Statement");
        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        // ==========================
        // 3. if-else-if Ladder
        // ==========================
        System.out.println("\n3. if-else-if Ladder");
        int marks = 82;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        // ==========================
        // 4. Nested if
        // ==========================
        System.out.println("\n4. Nested if");
        int age = 20;
        boolean hasLicense = true;

        if (age >= 18) {
            if (hasLicense) {
                System.out.println("Eligible to Drive");
            }
        }

        // ==========================
        // 5. switch Statement
        // ==========================
        System.out.println("\n5. switch Statement");
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Day");
        }

        // ==========================
        // 6. for Loop
        // ==========================
        System.out.println("\n6. for Loop");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        // ==========================
        // 7. while Loop
        // ==========================
        System.out.println("\n\n7. while Loop");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }

        // ==========================
        // 8. do-while Loop
        // ==========================
        System.out.println("\n\n8. do-while Loop");
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 5);

        // ==========================
        // 9. Enhanced for Loop
        // ==========================
        System.out.println("\n\n9. Enhanced for Loop");
        int[] arr = {10, 20, 30, 40, 50};

        for (int value : arr) {
            System.out.print(value + " ");
        }

        // ==========================
        // 10. break Statement
        // ==========================
        System.out.println("\n\n10. break Statement");
        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                break;
            }
            System.out.print(k + " ");
        }

        // ==========================
        // 11. continue Statement
        // ==========================
        System.out.println("\n\n11. continue Statement");
        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                continue;
            }
            System.out.print(k + " ");
        }

        // ==========================
        // 12. return Statement
        // ==========================
        System.out.println("\n\n12. return Statement");
        System.out.println("Program ends here.");
        return;

        // System.out.println("This line will never execute.");
    }
}
