import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // problem 1
        System.out.println("problem 1");
        long x = 5;
        long n = 16;
        long answer=0;
        Power pow = new Power();
        answer = pow.solution(x,n);
        System.out.print(answer);


        //problem 2
        System.out.println("\nproblem 2");
        ArrayList<Long> array = new ArrayList<Long>();
        int i = 1;
        int n2 = 10;
        for(long j =0; j<100; j++){
            array.add(j);
        }
        Binary_Recursive_sum bin = new Binary_Recursive_sum();
        System.out.print(bin.solution(array, i, n2));


        //problem 3
        System.out.println("\nproblem 3");
        int n3 =10;
        Fibonacci fibo = new Fibonacci();
        fibo.solution(n3);


        //quick sort
    }
}

