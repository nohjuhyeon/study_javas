public class Booleans {
    public static void main(String[] args) {
        boolean boolFirst = true;
        boolean boolSecond = false;
        // boolFirst && boolSecond
        // false
        // 5 > 6;
        // false
        boolFirst = !(5 > 6); // not 의 의미는 해당 구문 ()하고 맨 앞에 !
        // true
        // (5 > 6) && !(5 > 6)
        // false
        System.out.println(boolFirst);
        // return 0;
    }
}