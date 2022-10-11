package api.exercise.ex10;

import javafx.beans.binding.StringBinding;

import java.util.Arrays;

/**
 * @ClassName reversal
 * @Description TODO 字符串反转
 * @Author JaChen
 * @Date 2022/10/11 20:45
 * @Version 1.0
 *
 * 将字符串中指定部分进行反转。
 * 比如将“abcdefgho”实现部分反转，结果为”abfedcgho”
 */
public class reversal {
    public static void main(String[] args) {
//        StringBuffer s = new StringBuffer("abcdefgho");
//        System.out.println(s.reverse());

        String s = "abcdefgho";
        char[] c = s.toCharArray();
        String result = "";
        for (int i = 0; i < c.length; i++) {
            result += c[c.length-i-1];
        }
        System.out.println(result);
    }
}
