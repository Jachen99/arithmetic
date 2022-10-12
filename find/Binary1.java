/**
 * @ClassName Binary1
 * @Description TODO 二分查找int型
 * @Author JaChen
 * @Date 2022/10/11 21:21
 * @Version 1.0
 */
public class Binary1 {


    public static void main(String[] args) {
        int[] a = {2,3,4,5,3,4,2,4,5};
        System.out.println(binarySearch(a, 5));
    }

    public static int binarySearch(int[] intsArray, int des) {
        int left = 0;
        int right = intsArray.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (intsArray[mid] == des) {
                return mid;
            } else if (des > intsArray[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
