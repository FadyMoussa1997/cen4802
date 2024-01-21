import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int start = 0 ;
        System.out.printf("\n the fibonacci sequence is : ");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);  // Add 0 at index 0
        nums.add(1);  // Add 1 at index 1

        for(int i=2 ; i<15 ; i++){

            nums.add(nums.get(i-2)+nums.get(i-1)) ;
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.printf("\nplease enter a number to find the nth value in the fibonacci sequence\n");
        int target = scanner.nextInt();
        int adjustTarget = target - 1 ;

        int numm = find(adjustTarget , nums) ;
       System.out.printf("\n the "+target +" th number in the list is: "+numm);

        }

        public static int find(int index , ArrayList<Integer> nums){

        if (index==0 || index==1) {
            return nums.get(index) ;
        } else {
            return find(index - 2, nums) + find(index - 1, nums) ;
        }


        }


    }
