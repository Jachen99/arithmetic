/**
 * @ClassName Binary2
 * @Description TODO
 * @Author JaChen
 * @Date 2022/10/12 15:01
 * @Version 1.0
 */
public class Binary2 {
    public static void main(String[] args) {
        String[] s = {"a", "d", "e", "j", "k", "s"};
        System.out.println(binarySearch(s, "j"));
    }

    public static int binarySearch(String[] intsArray, String des) {
        int left = 0;
        int right = intsArray.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (intsArray[mid].equals(des)) {
                return mid;
            } else if (des.compareTo(intsArray[mid]) > 0) {//字符串比较大小的方法
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
