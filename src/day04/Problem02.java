package day04;

public class Problem02 {
    public static void main(String[] args){
        int number=10;
        try{
            int result = number / 0;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다");
        }
        System.out.println("프로그램을 계속 실행합니다.");
    }
}
