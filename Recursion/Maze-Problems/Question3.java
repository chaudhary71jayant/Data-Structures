/*
    The maze problem where we can move right down and diagnolly as well
 */

public class Question3 {
    public static void main(String[] args) {
        System.out.println(numberOfWays(2,3));
    }

    static int numberOfWays(int r,int c){
        //base condtion
        if(r == 1 && c ==1) return 1;
        
        int right=0,down=0,diagonal=0;

        if(r > 1) down += numberOfWays(r-1, c);
        if(c > 1) right  += numberOfWays(r, c-1);
        if(r>1 && c >1) diagonal = numberOfWays(r-1, c-1);

        return right+down+diagonal;
    }
}
