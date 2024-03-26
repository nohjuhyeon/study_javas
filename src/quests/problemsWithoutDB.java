// refer : https://www.w3schools.com/java/java_for_loop.asp
package quests;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class problemsWithoutDB {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> questionList = new ArrayList<HashMap<String, String>>();
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        HashMap<String, String> questionFirst = new HashMap<String, String>();
        HashMap<String, String> questionSecond = new HashMap<String, String>();
        HashMap<String, String> questionThird = new HashMap<String, String>();
        HashMap<String, String> questionForth = new HashMap<String, String>();
        // 값 넣기
        questionFirst.put("question", "1. 문제: Python에서 변수를 선언하는 방법은? (점수: 10점)");
        questionFirst.put("score", "10");
        questionFirst.put("choiceList", "1) var name, 2) name = value, 3) set name, 4) name == value");
        questionFirst.put("answer", "2");
        questionSecond.put("question", "2. 문제: Python에서 리스트(List)의 특징은 무엇인가요? (점수: 15점)");
        questionSecond.put("score", "15");
        questionSecond.put("choiceList", "1) 순서가 있고 변경 가능하다, 2) 중복된 값을 가질 수 없다, 3) 원소를 추가하거나 삭제할 수 없다, 4) 정렬된 상태로 유지된다");
        questionSecond.put("answer", "1");
        questionThird.put("question", "3. 문제: Python에서 조건문을 작성하는 방법은? (점수: 10점)");
        questionThird.put("score", "10");
        questionThird.put("choiceList", "1) if-else, 2) for-in, 3) while, 4) def");
        questionThird.put("answer", "1");
        questionForth.put("question", "4. 문제: Python에서 함수를 정의하는 방법은? (점수: 5점)");
        questionForth.put("score", "5");
        questionForth.put("choiceList", "1) class, 2) def, 3) import, 4) return");
        questionForth.put("answer", "2");
        questionList.add(questionFirst);
        questionList.add(questionSecond);
        questionList.add(questionThird);
        questionList.add(questionForth);
        int userScore = 0;
        for (HashMap<String, String> questionElement : questionList) {
            System.out.println(questionElement.get("question"));
            System.out.println(questionElement.get("choiceList"));
            Scanner answer = new Scanner(System.in);
            System.out.print("답하기 : ");
            int inputNum = answer.nextInt();
            answerList.add(inputNum);
            if (inputNum == Integer.parseInt(questionElement.get("answer"))) {
                userScore = userScore + Integer.parseInt(questionElement.get("score"));
            }
        }
        System.out.println("-------------------------------------------------");
        System.out.println("사용자의 답변 : " + answerList.get(0) + ", " + answerList.get(1) + ", " + answerList.get(2) + ", " + answerList.get(3));
        System.out.println("사용자의 점수 : " + userScore);
    }
}
