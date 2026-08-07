package LanguageBasics;
import java.util.*;

public class While {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();

        int sum = 0;
        int count = 0;
        int num = d;

        while (count < 50){
            sum += num;
            num += 10;
            count++;
        }
        System.out.println(sum);
        sc.close();
    }    
}
