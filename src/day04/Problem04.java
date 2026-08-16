package day04;

public class Problem04 {
    public static void main(String[] args){
        String[] names = {"홍길동", "김철수", "이영희"};
        int number = 10;
        try {
            int result = number / 0;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("잘못된 배열 접근입니다.");
        }
        System.out.println("프로그램을 계속 실행합니다.");
    }
}
