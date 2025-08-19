import java.util.*;

public class Leader {
    public static void printLeaders(int arr[]) {
        int n = arr.length;
        int maxFromRight = arr[n - 1];
        List<Integer> leaders = new ArrayList<>();

 
        leaders.add(maxFromRight);


        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                leaders.add(arr[i]);
                maxFromRight = arr[i];
            }
        }

   
        Collections.reverse(leaders);

     
        System.out.println("Leaders in the array are: " + leaders);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        printLeaders(arr);
        sc.close();
    }
}
