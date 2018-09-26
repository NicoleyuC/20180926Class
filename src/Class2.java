// 中文字 轉 萬國碼
// 周教授每次上課都留一手，回家練習的我感到頭很痛
import java.util.Scanner;

public class Class2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println((Integer.toHexString(st.charAt(0))));
    }
}
