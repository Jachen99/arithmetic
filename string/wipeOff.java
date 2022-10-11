package api.exercise.ex9;

/**
 * @ClassName wipeOff
 * @Description TODO 去除字符串两端的空格
 * @Author JaChen
 * @Date 2022/10/11 19:08
 * @Version 1.0
 *
 * 提示：不能使用trim()，实现去除字符串两端的空格。
 */
public class wipeOff {
    public static void main(String[] args) {
        String s = "     欢迎来到 JaChen 的世界！     ";
        //System.out.println(s.trim());//当然不能直接这么写，面试是要造航母的。
//        System.out.println(myResult1(s));
        System.out.println(myResult2(s));
    }
    // 方法一：利用char数组截取开始和结束下标
    public static String myResult1(String s){
        char[] c = s.toCharArray();
        int start = 0;
        for(int i=0; i<c.length; i++){
            if(c[i] != ' '){
                start = i;
                break;
            }
        }
        int end = 0;
        for(int i=0; i<c.length; i++){
            if(c[c.length-i-1] != ' '){
                end = c.length-i-1;
                break;
            }
        }
        return s.substring(start,end);
    }

    //方法二：（1）从左往右截取，只要字符串以“空格”开头，就截掉开头1个字符
    //      （2）从右往左截取，只要字符串以“空格”结尾，就截掉末尾的1个字符
    public static String myResult2(String s){
        while (s.startsWith(" ")){
            s = s.substring(1);
        }
        while (s.endsWith(" ")){
            s = s.substring(0, s.length()-1);
        }
        return s;
    }
}
