import java.util.Scanner;

public class ThreePiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int a1=sc.nextInt(),a2=sc.nextInt(),a3=sc.nextInt();
            System.out.println(game( a1, a2, a3));
        }
        sc.close();
    }
    private static int game(int a,int b,int p){
        int max = Math.abs(a-b);
        int taken = a+p;
        int aftertaken = Math.abs(taken-b);
        if(aftertaken > max) max = aftertaken;
        return max;
    }
}
