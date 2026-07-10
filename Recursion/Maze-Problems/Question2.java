//Same as last question just need to print all the ways

public class Question2 {
    public static void main(String[] args) {
        path("", 3, 3);
    }

    static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if( r > 1) {
            path(p + 'D', r-1, c);
        }

        if(c>1){
            path(p+'R', r, c-1);
        }
    }
}
