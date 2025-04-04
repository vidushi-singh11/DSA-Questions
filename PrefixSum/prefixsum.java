import java.util.Scanner;    
public class prefixsum {
    public static void main(String[] args) { 
        Scanner sc= new Scanner(System.in);
        //enter the size of the array
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int prefixSum[] = new int[n];

        //enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Calculate prefix sums
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        // Print the original array
        System.out.println("Orriginal array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // Print the prefix sums
        System.out.println("Prefix sums:");
        for (int i = 0; i < n; i++) {
            System.out.print(prefixSum[i] + " ");
        }
        sc.close();
    }
}