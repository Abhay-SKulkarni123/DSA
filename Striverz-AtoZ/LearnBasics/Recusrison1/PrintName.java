import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int n = sc.nextInt();
        
        Name(name, 0, n);

        sc.close();
    }
    
    static void Name(String name, int count, int n){
        if(count == n){
            return;
        }
        System.out.print(name + " ");
        Name(name, count+1, n);
    }
}