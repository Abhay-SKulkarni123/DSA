package Basics;
import java.util.*;

class ConditionalLoops{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        // ifStat();
        // ifElseStat();
        // multiIfElse();
        // forLoop();
        // whileLoop();
        // doWhileLoop();
        // switchCase();
        // nestedSwitchCase();
        // caseCheck();
        // largest();
        // reverse();
        // countNums();
    }

    static void ifStat(){
        int a = sc.nextInt();
        if (a > 10){
            System.out.println("Hello, World!");
        }
    }

    static void ifElseStat(){
        int salary = sc.nextInt();
        if (salary >= 50000){
            salary += 10000;
        }
        else {
            salary += 5000;
        }
        System.out.println(salary);
    }

    static void multiIfElse(){
        int age = sc.nextInt();
        if (age < 13){
            System.out.println("Kid");
        }
        if (age > 13 && age < 19){
            System.out.println("Teenager");
        }
        else if (age > 19 && age < 60){
            System.out.println("Adult");
        }
        else {
            System.out.println("Senior Citizen");
        }
    }

    static void forLoop(){
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            System.out.println(i + " : Hello, World!");
        }
    }

    static void whileLoop(){
        int n = 1;
        while (n <= 10){
            System.out.println(n);
            n++;          
        }
    }

    static void doWhileLoop(){
        int n = 1;
        do{
            System.out.println(n);
            n++;
        }while(n <= 5);
    }

    static void switchCase(){
        int day = sc.nextInt();
        // switch(day){
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        // }

        switch (day){
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }

    static void nestedSwitch(){
        int empID = sc.nextInt();
        String department = sc.next();
        switch (empID) {
            case 1 -> System.out.println("Kunal Kushwaha");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }

    static void caseCheck(){
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Uppercase");
        }
    }

    static void largest(){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ans = Math.max(a, Math.max(b, c));
        System.out.println("Largest of all is " + ans);
    }

    static void reverse(){
        int num = sc.nextInt();
        int ans = 0;
        while (num > 0){
            int rem = num % 10;
            num /= 10;
            ans = ans*10 + rem;
        }
        System.out.println(ans);
    }

    static void countNums(){
        int n = sc.nextInt();
        int count = 0;
        while(n > 0){
            count++;
            n /= 10;
        }
        System.out.println("Number of Digits is " + count);
    }
}