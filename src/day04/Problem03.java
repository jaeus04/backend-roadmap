package day04;

public class Problem03 {
    public static void main(String[] args){
        String[] names = {"홍길동", "김철수", "이영희"};

        try{
            System.out.println(names[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("잘못된 배열 접근입니다.");
        }
        System.out.println("프로그램을 계속 실행합니다.");
    }
}
