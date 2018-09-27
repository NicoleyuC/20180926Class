// 找零錢
import java.util.Scanner;

public class class6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),
            a = sc.nextInt(),
            o = sc.nextInt(),
            p = sc.nextInt();
        int m = n - a*15 - o*20 - p*30;

        if ( m < 0 ){
            System.out.println("0");
        }else{
            System.out.println( m/50 );
            m = m % 50;
            System.out.println( m/5 );
            m = m % 5;
            System.out.println( m/1 );
        }
    }
}
