package day02;
import day01.Student;
import java.util.ArrayList;

public class Problem03 {
    public static void main(String[] args){
        Student student1 = new Student("홍길동", 20260001, 85);
        Student student2 = new Student("김철수", 20260002, 72);
        Student student3 = new Student("이영희", 20260003, 95);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        for(int i = 0; i < students.size(); i++){
            students.get(i).printStdinfo();
        }
    }
}
