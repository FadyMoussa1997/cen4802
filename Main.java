import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class demonstrates the calculation of Fibonacci sequence and finding the value of the nth entered by the user.
 */

public class Main {


    /**
     * The main method that displays and runs the Fibonacci sequence calculation and finds and displays the nth value.
     *
     *
     */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int start = 0 ;
        System.out.printf("\n the fibonacci sequence is : ");


        // initializing an array list to hold the values of the Fibonacci sequence
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);  // Add 0 at index 0
        nums.add(1);  // Add 1 at index 1

        // filling the rest of the values of the Fibonacci sequence through a calculation.
        for(int i=2 ; i<15 ; i++){

            nums.add(nums.get(i-2)+nums.get(i-1)) ;
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }

        // asking the user to choose an index of the Fibonacci sequence in order to search for its value

        System.out.printf("\nplease enter a number to find the nth value in the fibonacci sequence\n");
        int target = scanner.nextInt();

        /*
        adjusting the starting point to 1 instead of 0 as normal people will start counting from 1 as most
        they are not familiar with programming concepts that start counting from zero.
        this way, they will see the first element in the list as 1th instead of 0th
         */

        // adjusting the starting point to 1 instead of 0 as normal people will start counting from 1

        int adjustTarget = target - 1 ;

// assigning the value of the index to numm
        int numm = find(adjustTarget , nums) ;
       System.out.printf("\n the "+target +" th number in the list is: "+numm);

        }


    /**
     * Recursively finds the Fibonacci value at a given index.
     *
     * @param index The index in the Fibonacci sequence to find the value for.
     * @param nums  The ArrayList containing Fibonacci values.
     * @return The Fibonacci value at the specified index.
     */
        public static int find(int index , ArrayList<Integer> nums){

        if (index==0 || index==1) {
            return nums.get(index) ;
        } else {
            return find(index - 2, nums) + find(index - 1, nums) ;
        }


        }


    }
