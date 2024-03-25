package quests;

import java.util.Scanner;
public class ForsIfs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input_num = scanner.nextInt();
        for ( int for_num = 1 ; for_num <= input_num ; for_num = for_num + 1){
            int result_num = (int)Math.pow(2, for_num);
            int mod_num = result_num%4;
            if (mod_num == 0){
                System.out.println("2 ** " + for_num + " = " +result_num);
            }
        }
        
        scanner.close();
    }
}

// public class ForsIfs {
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         int input_num = scanner.nextInt();
//         for ( int for_num = 1 ; for_num <= input_num ; for_num = for_num + 1){
//             int check_num = 1;
//             for (int i = 1 ; i <= for_num;i = i+1){
//                 check_num = check_num * 2;
//             }
//             int mod_num = check_num%4;
//             if (mod_num == 0){
//                 System.out.println("2 ** " + for_num + " = " +check_num);
//             }
//         }
        
//         scanner.close();
//     }
// }

