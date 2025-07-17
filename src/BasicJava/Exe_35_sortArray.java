package BasicJava;

import java.util.Scanner;

public class Exe_35_sortArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.printf("Please enter the size of array---");
        int size=sc.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf("Please enter the element-");
            arr[i]= sc.nextInt();

        }
        System.out.printf("Entered array is---");
        for (int i = 0; i <arr.length ; i++) {

            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

            for (int j = 0; j <arr.length ; j++) {
                System.out.print(arr[j]);

            }
        }
    }


