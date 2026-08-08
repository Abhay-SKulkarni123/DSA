import java.util.*;

public class arrayUnion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }

        int i = 0;
        int j = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while (i < n && j < m){
            int value;

            if (arr1[i] < arr2[j]){
                value = arr1[i++];
            }
            else if (arr2[j] < arr1[i]){
                value = arr2[j++];
            }
            else{
                value = arr1[i];
                i++;
                j++;
            }
            if (list.isEmpty() || list.get(list.size() - 1) != value){
                list.add(value);
            }
        }
        while (i < n){
            int value = arr1[i++];
            if (list.isEmpty() || list.get(list.size() -1) != value){
                list.add(value);
            }
        }
        while(j < m){
            int value = arr2[j++];
            if (list.isEmpty() || list.get(list.size() -1) != value){
                list.add(value);
            }
        }
        for (int x : list){
            System.out.print(x + " ");
        }
        sc.close();
    }
}
