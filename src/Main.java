import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // problem 1
//        System.out.println("problem 1");
//        long x = 5;
//        long n = 16;
//        long answer=0;
//        Power pow = new Power();
//        answer = pow.solution(x,n);
//        System.out.print(answer);
//
//
//        //problem 2
//        System.out.println("\nproblem 2");
//        ArrayList<Long> array = new ArrayList<Long>();
//        int i = 1;
//        int n2 = 10;
//        for(long j =0; j<100; j++){
//            array.add(j);
//        }
//        Binary_Recursive_sum bin = new Binary_Recursive_sum();
//        System.out.print(bin.solution(array, i, n2));
//
//
//        //problem 3
//        System.out.println("\nproblem 3");
//        int n3 =10;
//        Fibonacci fibo = new Fibonacci();
//        fibo.solution(n3);

        StudentInfo student1 = new StudentInfo();
        student1.setStudentID("201740000");
        student1.setStudentName("sangho");

        StudentInfo student2 = new StudentInfo();
        student2.setStudentID("20170001");
        student2.setStudentName("sangho2");

        StudentInfo student3 = new StudentInfo();
        student3.setStudentID("20174002");
        student3.setStudentName("sangho3");

        StudentInfo student4 = new StudentInfo();
        student4.setStudentID("20174003");
        student4.setStudentName("sangho4");

        StudentInfo student5 = new StudentInfo();
        student5.setStudentID("20174004");
        student5.setStudentName("sangho5");

        StudentInfo student6 = new StudentInfo();
        student6.setStudentID("20170005");
        student6.setStudentName("sangho6");


        StudentInfo student7 = new StudentInfo();
        student7.setStudentID("20170006");
        student7.setStudentName("sangho7");


        StudentInfo student8 = new StudentInfo();
        student8.setStudentID("201740007");
        student8.setStudentName("sangho8");

        MyHashTable studenthash = new MyHashTable(13);

        studenthash.put(student1.getStudentID(), student1.getStudentName());

        studenthash.put(student2.getStudentID(), student2.getStudentName());

        studenthash.put(student3.getStudentID(), student3.getStudentName());

        studenthash.put(student4.getStudentID(), student4.getStudentName());

        studenthash.put(student5.getStudentID(), student5.getStudentName());

        studenthash.put(student6.getStudentID(), student6.getStudentName());

        studenthash.put(student7.getStudentID(), student7.getStudentName());

        studenthash.put(student8.getStudentID(), student8.getStudentName());


        System.out.println(studenthash.get(student2.getStudentID()));


    }
}

