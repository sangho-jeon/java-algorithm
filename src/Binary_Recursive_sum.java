import java.util.ArrayList;

public class Binary_Recursive_sum {
    public long solution(ArrayList<Long> A, int i, int n){
        int index;
        if((int)n == 1){
            return A.get(i);
        }
        else{
            index = (int)Math.ceil((double)n/2);
            return solution(A, i, index) + solution(A, i+index, n/2 );
        }
    }
}
