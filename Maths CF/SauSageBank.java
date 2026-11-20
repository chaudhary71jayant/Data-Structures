import java.util.Scanner;

public class SauSageBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long res = (1L << (n-k+1)) + (long)(k-1)*2;
            System.out.println(res);
        }


        sc.close();
    }
}
