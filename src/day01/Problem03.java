package day01;

public class Problem03 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 4, 1, 8, 6};
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
