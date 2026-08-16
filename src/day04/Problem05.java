package day04;

public class Problem05 {
    public static void main(String[] args){
        int number = 10;

        try {
            int result = number / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("계산 중 오류가 발생했습니다.");
        } finally {
            System.out.println("계산 작업이 종료되었습니다.");
        }
    }
}
