import java.util.*;

public class insertionSort {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        //input array elements
        System.out.print("Enter the numbers you want to sort in aesc: ");
        for(int  i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        //insertion sort algorithm

        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int j = i-1;

            while(j >=0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
        }

        printArray(arr);
    }
}
