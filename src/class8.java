// 停車費率 - 蕎羽笨蛋法
import java.util.Scanner;

public class class8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt(), m1 = sc.nextInt(),
                h2 = sc.nextInt(), m2 = sc.nextInt();
        int tt =(h2-1-h1)*60+(m2+60-m1);
        if ( tt < 120 ){
            System.out.println((tt/30)*30);
        }else if ( tt < 240){
            System.out.println((tt/30)*40);
        }else{
            System.out.println(4*30+4*40+(tt-240)/30*60);
        }
    }
}
