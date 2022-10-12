import java.util.Arrays;

/**
 * @ClassName PrimeNumber
 * @Description TODO
 * @Author JaChen
 * @Date 2022/10/12 16:12
 * @Version 1.0
 */
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(suShu(100)));
    }

    public static int[] suShu(int n){
        int[] arr = new int[n];

        int index=0;
        for (int i = 2; i < n; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if(i%j==0) {
                    flag=false;
                    break;
                }
            }
            if(flag) {
                arr[index++] = i;
            }
        }
        return Arrays.copyOf(arr, index);
    }
}
