public class Power {
    long y;

    public long solution(long x, long n) {

        if (n == 0) {
            return 1;
        }
        if (n % 2 == 1) {
            y = solution(x, (n - 1) / 2);
            return x * y * y;
        }
        else{
            y = solution(x, n / 2);
            return y * y;
        }
    }
}
