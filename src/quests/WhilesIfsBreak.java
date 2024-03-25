package quests;

import java.util.Scanner;
public class WhilesIfsBreak {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean whileFlag = true;
        while (whileFlag) {
            int input_score = scanner.nextInt();
            if (input_score == -1) {
                break;
            }    
            else if (input_score >= 90) {
                System.out.println("A");
            } 
            else if (input_score >= 80) {
                System.out.println("B");
            } 
            else if (input_score >= 70) {
                System.out.println("C");
            } 
            else {
                System.out.println("F");
                
            }
        }
        
        scanner.close();
    }
}


