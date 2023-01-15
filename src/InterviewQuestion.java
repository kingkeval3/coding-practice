import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InterviewQuestion {

    public static int kadane(int[] A)
    {
        // stores the maximum sum subarray found so far
        int maxSoFar = 0;

        // stores the maximum sum of subarray ending at the current position
        int maxEndingHere = 0;

        // traverse the given array
        for (int i: A)
        {
            // update the maximum sum of subarray "ending" at index `i` (by adding the
            // current element to maximum sum ending at previous index `i-1`)
            maxEndingHere = maxEndingHere + i;

            // if the maximum sum is negative, set it to 0 (which represents
            // an empty subarray)
            maxEndingHere = Integer.max(maxEndingHere, 0);

            // update the result if the current subarray sum is found to be greater
            maxSoFar = Integer.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        //Taking USER INPUT
        System.out.println("Enter number of elements:");
        Integer numberOfElements = scanner.nextInt();

        System.out.println("Enter modulo divisor");
        Integer moduloDivisor = scanner.nextInt();

        BufferedReader bi = new BufferedReader(
                new InputStreamReader(System.in));

        // Custom integer array of size 10
        int num[] = new int[10];
        // Array of string type to store input
        String[] strNums;

        // Display message
        System.out.println("enter array of numbers");

        // Reading input a string
        strNums = bi.readLine().split(" ");

        for (int i = 0; i < strNums.length; i++) {
            Integer intarr = Integer.parseInt(strNums[i]);
            if(intarr.equals(0)){
                continue;
            }
            num[i] = Integer.parseInt(strNums[i]);
        }


        System.out.println(kadane(num));
    }

}
