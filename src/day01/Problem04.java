package day01;

public class Problem04 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 4, 1, 8, 6};
        int max, min;
        max=numbers[0];
        min=numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(max<numbers[i]){
                max=numbers[i];
            }
            if(min>numbers[i]){
                min=numbers[i];
            }
        }
        System.out.println("최댓값: "+max);
        System.out.print("최솟값: "+min);
    }
}
