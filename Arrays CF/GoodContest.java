import java.util.Scanner;

public class GoodContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int a1=sc.nextInt(),a2=sc.nextInt(),a3=sc.nextInt();
            System.out.println(goodContest(n, a1, a2, a3));
        }
        sc.close();
    }

    private static int goodContest(int n,int a1,int a2,int a3){
        int weak = Math.min(a1,Math.min(a2,a3));
        return n-weak;
    }
}
