// refer : https://www.w3schools.com/java/java_for_loop.asp

import java.util.ArrayList;

public class LoopsFors {
    public static void main(String[] args) {


        /*
         * for 동작 위한 조건 : 시작 점, 종료 조건, 반복 횟수
         * 시작점 : statement 1
         * 종료 조건 : statement 2
         * 반복 횟수 : statement 3
         * for (statement 1 ; statement 2 ; statement 3){
         * }
         */
        /*
         * 예제 : 1 부터 5 까지 1씩 증가하며 출력하는 것
         */
        // for (int count = 1 ; count <= 5 ; count = count + 1 ){
        // for (int count = 1 ; count <= 5 ; count++){
        // System.out.println("For count : " + count);
        // }
        ArrayList<String> listFirst = new ArrayList<String>();
        // 값 넣기
        listFirst.add("Volvo");
        listFirst.add("BMW");
        listFirst.add("Ford");
        for (int i = 0; i < listFirst.size();i++){
            System.out.println("for count "+listFirst.get(i));
        }
        
        // for (type variableName : arrayName) {
        // code blcok to be executed
        // }
        for(String str:listFirst){
            System.out.println("for each " + str);
        }
        String strFirst = new String("Hellow World !");

        System.out.println("Hello Main !");

    }
}
