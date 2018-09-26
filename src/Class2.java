// 中文字 轉 萬國碼 | 萬國碼 轉 中

import java.util.Scanner;

public class Class2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int x = Integer.parseInt(st,16);
        System.out.println((char)x);
    }
}
