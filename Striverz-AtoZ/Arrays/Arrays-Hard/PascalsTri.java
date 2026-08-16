import java.util.*;

class PascalsTri{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<List<Integer>> res = new ArrayList<>();
        for (int i=0; i<n; i++){
            List<Integer> row = new ArrayList<>();
            for (int j=0; j<=i; j++){
                if (j == 0 || j == i){
                    row.add(1);
                }
                else{
                    row.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            res.add(row);
        }
        System.out.println(res);
        sc.close();
    }
}