import java.util.*;

public class descending_sort {
    public long solution(long n) {
        long answer = 0;
        String strResult="";
        String strn = String.valueOf(n); // tostring을 사용해도 무방. but null일 경우에 다름.
        List<String> slist = Arrays.asList(strn.split(""));
        List<Integer> ilist = new ArrayList<Integer>();
        for(String s : slist) {
            ilist.add(Integer.parseInt(s));
        }


        ilist.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });





        for(Integer i : ilist) {
            strResult+=String.valueOf(i);
        }
        answer = Long.parseLong(strResult);
        return answer;
    }


}
