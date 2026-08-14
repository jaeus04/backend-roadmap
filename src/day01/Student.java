package day01;

public class Student {
    private String name;
    private int studentId;
    private int score;

    public Student(String name, int studentId, int score) {
        this.name = name;
        this.studentId = studentId;
        this.score = score;
    }

    public void printStdinfo() {
        System.out.println("이름: " + name);
        System.out.println("학번: " + studentId);
        System.out.println("점수: " + score);
    }
    public void printPass(){
        if(score >=60){
            System.out.println("합격 여부: 합격");
        }
        else{
            System.out.println("합격 여부: 불합격");
        }
    }

    public String getName(){
        return name;
    }
    public int getstudentId(){
        return studentId;
    }
    public int getscore(){
        return score;
    }

}
