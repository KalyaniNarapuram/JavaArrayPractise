package love.programming;

import java.util.*;

public class MyHomeWork {
    public static void main(String[] args) {

    int[] myarray = new int[10];

    int n, sum = 0;
    float average;

    Scanner s = new Scanner(System.in);
        System. out. print("Enter no. of elements you want in array:");
    n = s. nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n ; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum / n;
        System.out.println("Average:"+average);
}
}
