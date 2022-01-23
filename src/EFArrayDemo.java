// create an array of 5 elements and print the values.

import java.util.Scanner;

public class EFArrayDemo {
    public static void main(String[] args) {
        int arr[]; //declaration
        arr = new int[5]; //creation
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        for (int rec : arr) {
            System.out.println(rec);
        }
    }
}
