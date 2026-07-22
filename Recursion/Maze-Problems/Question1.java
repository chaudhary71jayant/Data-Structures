//There is a person on the position (0,0) in a maze of size m x n who want to reach the very end i.e.(m-1,n-1), but either he can go down direction or right direction, return the number of ways he can go to the destination.

public class Question1 {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
    }

    static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }

        int down = count(r-1,c);
        int right = count(r,c-1);

        return down+right;
    }
}
