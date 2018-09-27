// 判斷座標是否在圓形內
import java.util.Scanner;

public class class7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(),
            Y = sc.nextInt();
        if ( Math.sqrt(X*X+Y*Y) <= 100){
            System.out.println("inside");
        }else{
            System.out.println("outside");
        }
    }
}
