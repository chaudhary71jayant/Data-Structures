import java.util.Scanner;

public class DoMadarchod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();
            }
            wins(arr);
        }

        sc.close();
    }

    private static void wins(int[] nums){
        int oneCount=0,zeroCount=0;
        for(int num : nums){
            if(num == 0) zeroCount++;
            else oneCount++;
        }

        if(zeroCount > oneCount) System.out.println("Elsie");
        else System.out.println("Bessie");
    }
}
