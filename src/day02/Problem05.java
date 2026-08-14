package day02;
import java.util.HashMap;

public class Problem05 {
    public static void main(String[] args){
        HashMap<Integer, String> students = new HashMap<>();
        students.put(20260001, "홍길동");
        students.put(20260002, "김철수");
        students.put(20260003, "이영희");
        System.out.println(students.get(20260002));
    }
}
