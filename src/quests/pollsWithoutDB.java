// refer : https://www.w3schools.com/java/java_for_loop.asp
package quests;

import java.util.ArrayList;
import java.util.Scanner;

public class pollsWithoutDB {
    public static void main(String[] args) {
        ArrayList<String> listMovie = new ArrayList<String>();
        // 값 넣기
        listMovie.add("1. 인터스텔라 선호도");
        listMovie.add("2. 해리포터 선호도");
        listMovie.add("3. 선호도");
        ArrayList<String> listanswer = new ArrayList<String>();
        for (int i = 0; i < listMovie.size();i++){
            System.out.println(listMovie.get(i));
            System.out.println("1) 좋음 2) 중간 3) 나쁨");
            Scanner answer = new Scanner(System.in);
            System.out.print("답하기 : ");
            String input_num = answer.nextLine();
            listanswer.add(input_num);
        }   
        System.out.println("답한 내용 출력 : " + listanswer.get(0) + ", "+ listanswer.get(1) + ", " + listanswer.get(2));

    }
}
