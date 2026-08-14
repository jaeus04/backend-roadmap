package day02;
import day01.Student;
import java.util.ArrayList;
import java.util.HashMap;

public class Problem06 {
    public static void main(String[] args){
        Student student1 = new Student("홍길동", 20260001, 85);
        Student student2 = new Student("김철수", 20260002, 72);
        Student student3 = new Student("이영희", 20260003, 95);
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        for(Student student : studentArrayList){
            student.printStdinfo();
        }

        HashMap<Integer, Student> studentHashMap = new HashMap<>();
        studentHashMap.put(20260001, student1);
        studentHashMap.put(20260002, student2);
        studentHashMap.put(20260003, student3);
        Student student = studentHashMap.get(20260002);
        student.printStdinfo();
    }
}
