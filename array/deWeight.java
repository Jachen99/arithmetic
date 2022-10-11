package api.exercise.ex3;

import java.util.Arrays;

/**
 * @ClassName deWeight
 * @Description TODO 数组去重
 * @Author JaChen
 * @Date 2022/10/11 19:52
 * @Version 1.0
 * <p>
 * 有一个长度为10的整数数组，
 * 例如，{9,10,6,6,1,9,3,5,6,4}。去除数组中重复的内容，
 * 只保留唯一的元素。
 */
public class deWeight {
    public static void main(String[] args) {
        int[] arr = {9, 10, 6, 6, 1, 9, 3, 5, 6, 4};

        int count = arr.length;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    System.arraycopy(arr, i + 1, arr, i, count - i - 1);
                    count--;
                    i--;
                }
            }
        }
        arr = Arrays.copyOf(arr, count);
        System.out.println(Arrays.toString(arr));
    }
}
