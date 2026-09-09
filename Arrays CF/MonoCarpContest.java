
import java.util.Scanner;

public class MonoCarpContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();
            }
            System.out.println(operations(arr));
        }
        sc.close();
    }

    private static int operations(int[] nums){
        int n = nums.length;
        if(nums[0]==0 && nums[n-1]==0) return 0;

        int count = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == 0) count++;
        }

        if(count < 2) return -1;
        else if(nums[0] == 0 && nums[n-1] != 0 || nums[0] != 0 && nums[n-1] == 0) return 1;
        
        return 2;
    }
}
