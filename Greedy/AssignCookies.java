
import java.util.Arrays;


public class AssignCookies {
    public static void main(String[] args) {
        int[] g =  {1,2};
        int[] s = {1,2,3};

        System.out.print("At max we can give only : " + findContentChildren(g, s));
    }

    public static  int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i=0,j=0,count=0;

        while(i<g.length && j<s.length){
            if(s[j] >= g[i]){
                count++;
                i++;
                j++;
            }
            j++;
        }
        return count;
    }
}
