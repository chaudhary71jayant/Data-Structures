
import java.util.Scanner;

public class MooLanguageSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();

            String s = sc.next();
            System.out.println(count(s, k,n));
        }
        sc.close();
    }

    private static int count(String s,int k,int n){
        int count = 0;
        for(int i=0;i<n;i+=k){
            String chunk = s.substring(i, i+k);

            if(chunk.contains("0")){
                continue;
            }
            count++;
        }
        return count;
    }
}
