// 標準體重計算
import java.util.Scanner;
import static java.lang.Math.round;

public class class5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), g = sc.nextInt();
        if ( g == 1 ){
            System.out.println(round((h-80)*0.7)*10/10f);
        }else System.out.println(round((h-70)*0.6)*10/10f);
    }
}
