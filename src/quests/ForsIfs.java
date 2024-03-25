package quests;

import java.util.Scanner;
public class ForsIfs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input_num = scanner.nextInt();
        for ( int for_num = 1 ; for_num <= input_num ; for_num = for_num + 1){
            int mod_num = for_num %4;
            if (mod_num == 0){
                System.out.println(for_num + " / 4 = " + for_num/4  );
            }
        }
        
        scanner.close();
    }
}
