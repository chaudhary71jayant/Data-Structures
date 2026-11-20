package stack;
import  java.util.*;

public class PreviousSmaller {
    public static void main(String[] args) {
        int[] arr = {4,5,2,10,8};
        int[] ans = previousSmallerElements(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+",");
        }
    }

    static int[] previousSmallerElements(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && stack.peek() > nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }
            if(!stack.isEmpty() && stack.peek() < nums[i]){
                ans[i] = stack.peek();
            }
            stack.push(nums[i]);
        }
        return ans;
    }
}
