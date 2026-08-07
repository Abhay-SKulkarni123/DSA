package Patterns;

public class Patterns {
    public static void main(String[] args) {
        p31(5);
    }
    
    static void p1 (int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void p2 (int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void p3 (int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void p4 (int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
        
    static void p5 (int n){
        for (int i = 0; i < 2 * n ; i++){
            int form = i > n ? 2 * n - i : i;
            for (int j = 0; j < form; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void p28 (int n){
        for (int i = 0; i < 2 * n ; i++){
            int form = i > n ? 2 * n - i : i;
            
            int space = n - form;
            for(int s = 0; s < space; s++){
                System.out.print(" ");
            }
            for (int j = 0; j < form; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void p30 (int n){
        for (int i = 1; i <= n ; i++){
            for(int s = 0; s < n - i; s++){
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--){
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    static void p17 (int n){
        for (int i = 1; i <= 2 * n ; i++){
            int c = i > n ? 2 * n - i : i;
            for(int s = 0; s < n - c; s++){
                System.out.print(" ");
            }
            for (int j = c; j >= 1; j--){
                System.out.print(j);
            }
            for (int j = 2; j <= c; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    static void p31(int n){
    int size = 2 * n - 1;

    for(int i = 0; i < size; i++){
        for(int j = 0; j < size; j++){

            int top = i;
            int left = j;
            int right = size - 1 - j;
            int bottom = size - 1 - i;

            int val = n - Math.min(Math.min(top, bottom), Math.min(left, right));

            System.out.print(val + " ");
        }
        System.out.println();
    }
}
}

