package utility;

public class ArrayUtility {
    //tính tổng các số nguyên
    public static long sumArray(){
        long sum = 0;
        for (int i = 0; i <= 1000; i++){
            sum += i;
        }
        return sum;
    }
}
