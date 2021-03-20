import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
    ArrayList<Integer> tmp = new ArrayList<Integer>(Arrays.asList(0,0));

    public ArrayList<Integer> solution(int n){

        int i,j;
        if(n<=1){
            tmp.set(0, n);
            tmp.set(1, 0);
            System.out.println("recursion no." + n);
            System.out.println(tmp.get(0));
            System.out.println(tmp.get(1));
            return tmp;
        }
        else{
            tmp = solution(n-1);
            i = tmp.get(0);
            j = tmp.get(1);
            tmp.set(0, i+j);
            tmp.set(1, i);
            System.out.println("recursion no." + n);
            System.out.println(tmp.get(0));
            System.out.println(tmp.get(1));
            return tmp;
        }
    }
}

