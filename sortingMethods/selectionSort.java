import java.util.*;

public class selectionSort {

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        //input array elements
        System.out.print("Enter the numbers you want to sort in aesc: ");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        //selection sort algorithm
        for(int i=0; i<arr.length-1; i++) {
            int smallest = i;

            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);
    }
}
