package quests;

import java.util.Scanner;
public class Additions {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int intFirst = scanner.nextInt();
        int intSecond = scanner.nextInt();
        int intSum = intFirst + intSecond;
        System.out.println("intSum : " + intSum);
        
        scanner.close();
    }
}
