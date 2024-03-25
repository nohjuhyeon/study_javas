
// refer : https://www.w3schools.com/java/java_arraylist.asp
import java.util.ArrayList;

public class DataTypeArrayLists {
    public static void main(String[] args) {
        ArrayList listFirst = new ArrayList();
        // 값 넣기
        listFirst.add("Volvo");
        listFirst.add("BMW");
        listFirst.add("Ford");

        // 값 가져오기
        // listFirst.get(0)
        // "Volvo"
        // listFirst.get(1)
        // "BMW"
        // listFirst.get(2)
        // "Ford"
        // listFirst.get(3)
        // IndexOutOfBoundsException@427 "java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3"

        // listFirst.size()
        // 3
        // 값 삭제하기
        // listFirst.remove(1)
        // "BMW"
        // listFirst.size()
        // 2
        System.out.println("Hello Main !");

    }
}
