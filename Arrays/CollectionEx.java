import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionEx {

    public static void main(String[] args) {
        
        // List<Object> heteroObj = new ArrayList<>();
        Map<String, Object> heteroObj = new HashMap<>();

        // heteroObj.add(1);
        // heteroObj.add("Saurabh");
        // heteroObj.add(new Student(1,"sam"));

        // for (Object object : heteroObj) {
        //     System.out.println(object);   
        // }
        heteroObj.put("number", "9999078595");
        heteroObj.put("name","Saurabh");
        heteroObj.put("isRight", true);

       for(Map.Entry<String,Object> entry :heteroObj.entrySet())
       {
          String key = entry.getKey();
          Object value = entry.getValue();
          System.out.println("Key: "+key+","+"Value: "+value);
       }
        
    }
    
}
