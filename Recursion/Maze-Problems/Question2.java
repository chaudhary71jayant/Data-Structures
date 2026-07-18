
import java.util.ArrayList;

//Same as last question just need to print all the ways or paths or we could say add them to the list

public class Question2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        path("", 3, 3,list);

        System.out.println(list);
    }

    static void path(String p,int r,int c,ArrayList<String> list){
        if(r==1 && c==1){
            list.add(p);
            return;
        }

        if( r > 1) {
            path(p + 'D', r-1, c,list);
        }

        if(c>1){
            path(p+'R', r, c-1,list);
        }
    }
}
