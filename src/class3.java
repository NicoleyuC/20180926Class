import java.util.Scanner;

public class class3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入半徑r 與圓柱高度h：");
        float r = sc.nextFloat();
        float h = sc.nextFloat();
        double p = Math.PI;
        System.out.println(p*r*r*h);
    }
}
