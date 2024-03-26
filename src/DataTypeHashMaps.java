import java.util.HashMap;

public class DataTypeHashMaps {
    public static void main(String[] args){
        HashMap<String, String> hashMap = new HashMap<String, String>();
        // 값 넣기
        hashMap.put("England","London");
        hashMap.put("Germany","Berlin");
        hashMap.put("Norway","Oslo");
        
        // hashMap.get("Norway")
        // "Oslo"
        // hashMap.size()
        // 3
        // hashMap.remove("Germany")
        // "Berlin"
        // hashMap.size()
        // 2

        for(String Key:hashMap.keySet()){
            System.out.println("hashMap value with Key : " + Key + ", value : " +hashMap.get(Key));
        }
        System.out.println("Hello World !");
        // return 0;
    }
}
