//Leetcode 1827 greedy question

public class MinimumOperation {

    public static void main(String[] args) {
        int[] arr = {1,1,1};

        System.out.print("The min operations needed to make array ascending are : "+ minOperations(arr));
    }

     public static  int minOperations(int[] nums) {
        int n = nums.length;
        if(n<=1) return 0;
        int first = nums[0],count=0;
        
        int i=1;
        while(i<n){
            if(first<nums[i]){
                first = nums[i];
                i++;
            } else {
                int diff = (first-nums[i])+1;
                count += diff;
            }
        }
        return count;
    }
}