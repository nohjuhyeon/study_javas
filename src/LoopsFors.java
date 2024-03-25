// refer : https://www.w3schools.com/java/java_for_loop.asp
public class LoopsFors {
    public static void main(String[] args) {
        /*
            for 동작 위한 조건 : 시작 점, 종료 조건, 반복 횟수
            시작점 : statement 1
            종료 조건 : statement 2
            반복 횟수 : statement 3 
         for (statement 1 ; statement 2 ; statement 3){  
         }
         */ 
        /*
         예지 : 1 부터 5 까지 1씩 증가하며 출력하는 것 
         */
        //  for (int count = 1 ; count <= 5 ; count = count + 1 ){
            for (int count = 1 ; count <= 5 ; count++){
                System.out.println("For count : " + count);
         }
        System.out.println("Hello Main !");
    }
}
