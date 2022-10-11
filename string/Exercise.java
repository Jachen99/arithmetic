package api.exercise;

/**
 * @ClassName Exercise
 * @Description TODO
 * @Author JaChen
 * @Date 2022/10/11 15:52
 * @Version 1.0
 * <p>
 * 在字符串中找出连续最长数字串，
 * 返回这个串的长度，并打印这个最长数字串。
 * <p>
 * 例如：abcd12345cd125se123456789，返回9，
 * 打印出123456789
 */
public class Exercise {
    public static void main(String[] args) {
        String s = "abcd12345cd125se123456789";
//        System.out.println(find(s).length());
//        System.out.println(find(s));
        System.out.println(find2(s).length());
        System.out.println(find2(s));
    }
    /* 方法一 转为char数组遍历，
    * 如果是数字 就用字符串result进行拼接
    * 如果不是数字，就比较判断这个result是不是
    * 最长的的结果，如果不是就交换，
    * 把result重新置空，来接受下一组数字
    * 最后还要再判断最后一次接受的数字与第一次接受的
    * 数字的长度。*/
    public static String find(String s) {
        char[] c = s.toCharArray();
        String max = "";
        String result = "";
        for (int i = 0; i < c.length; i++) {
            if ( c[i] >='0'&& c[i] <='9'){
                result += c[i];
            }else {
                if (result.length() > max.length()){
                    max = result;
                }
                result = "";
            }
        }
        if (result.length() > max.length()){
            max = result;
        }
        return result;
    }
    /*方法二：
    （1）先去掉最开头的字母
            “abcd12345cd125se123456789” ==》 “12345cd125se123456789”
    （2）拆分，按照字母拆分
            “12345cd125se123456789”
            ==》
            "12345"
            "125"
            "123456789"
    */
    public static String find2(String s) {
        s = s.replaceAll("^[A-Za-z]+", "");
        String[] result = s.split("[a-zA-Z]+");//剪切掉中间的字母
        String max = result[0];
        for (int i = 1; i < result.length; i++) {
            if (max.length() < result[i].length()) {
                max = result[i];
            }
        }
        return max;
    }
}

