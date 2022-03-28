import java.util.Scanner;

public class arraydemo {
    int arr[];
    int size[];
    int rear= -1;
    int front= -1; 

    public arraydemo(int size) {
        arr = new int[size];
        Scanner s = new Scanner(System.in);
        System.out.println("enter the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
    }

}


