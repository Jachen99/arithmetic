import java.util.Arrays;

/**
 * @ClassName Move
 * @Description TODO
 * @Author JaChen
 * @Date 2022/10/12 16:22
 * @Version 1.0
 */
public class Move {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        changPosition(1, 5, arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] changPosition(int n1, int n2, int[] ii) {
        int indexN1 = -1;
        for (int i = 0; i < ii.length; i++) {
            if (ii[i] == n1) {
                indexN1 = i;
                break;
            }
        }
        int indexN2 = -1;
        for (int i = 0; i < ii.length; i++) {
            if (ii[i] == n2) {
                indexN2 = i;
                break;
            }
        }
        // System.arraycopy 用法
        System.arraycopy(ii, indexN1 + 1, ii, indexN1, indexN2 - indexN1);
        ii[indexN2] = n1;
        return ii;
    }
}
