// 외부 입력
import java.util.Scanner;

public class Scanners {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("intFirst : ");
        int intFirst = scanner.nextInt();
        System.out.println("intSecond : ");
        int intSecond = scanner.nextInt();
        
        scanner.close();
    }
}
