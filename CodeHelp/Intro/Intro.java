package Intro;
import java.util.*;

public class Intro {
    static void Sum2(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        System.out.print("The Sum of 2 Numbers : " + sum);

        sc.close();
    }

    static void Avg3(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = (a + b + c) / 3;
        System.out.print("The Average of 3 Numbers : " + avg);

        sc.close();
    }

    static void Half(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int half = a / 2;
        System.out.print("The Half of the Number : " + half);

        sc.close();
    }

    static void Sum3(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;
        System.out.print("The Sum of 3 Numbers : " + sum);

        sc.close();
    }

    static void AreaRect(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int area = a * b;
        System.out.print("The Area of Rectangle : " + area);

        sc.close();
    }

    static void PosNeg(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>0){
            System.out.println("Positive Number");
        }

        else if(n<0){
            System.out.println("Negative Number");
        }

        else{
            System.out.println("Zero");
        }

        sc.close();
    }

    static void OneToN(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.print(i + " ");
        }

        sc.close();
    }

    static void OneToNEven(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<=n; i=i+2){
            System.out.print(i + " ");
        }

        sc.close();
    }

    static void SumN(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        for (int i=0; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("Sum of N Numbers : "+ sum);
        sc.close();
    }

    static void Multi(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int multi = a * b;
        System.out.println("Multiplication of Two Numbers : "+ multi);
        sc.close();
    }

    static void Peri(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int peri = a + b + c;
        System.out.println("Perimeter of Triangle : "+ peri);
        sc.close();
    }

    static void SI(){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();

        int si = (p * t * r) / 100;
        System.out.println("Simple Interest : "+ si);
        sc.close();
    }

    static void CI(){
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double t = sc.nextDouble();
        double r = sc.nextDouble();

        double a = p * Math.pow((1 + r / 100), t);

        double ci = a - p;
        System.out.println("Compound Interest : "+ ci);
        sc.close();
    }

    static void NTo1(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=n; i>=1; i--){
            System.out.print(i + " ");
        }

        sc.close();
    }

    static void Max2(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println("Max : " + a);
        }

        else{
            System.out.println("Max : "+ b);
        }

        sc.close();
    }

    public static void main(String[] args){
        Max2();
    }
}
