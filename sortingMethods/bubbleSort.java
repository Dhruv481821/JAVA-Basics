// package sortingMethods;
import java.util.*;

public class bubbleSort {

    public static void bubbleSort (int arr[]) {

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        int elements[] = new int[size];

        //input

        System.out.print("Enter the elements for apply bubble sort method: ");
        for(int i=0; i<size; i++) {
            elements[i] = sc.nextInt();
        }


        //bubble sort algorithm
        for(int i=0; i<elements.length-1; i++) {
            for(int j=0; j<elements.length-i-1; j++) {
                if (elements[j] > elements[j+1]) {
                    //swap
                    int temp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = temp;
                }
            }
        }

        System.out.println("The sorted elements are: ");
        bubbleSort(elements);
    }
}
