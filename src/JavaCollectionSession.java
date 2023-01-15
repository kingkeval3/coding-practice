import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class JavaCollectionSession {

    public static void main(String[] Args) {

        Map<String,Object> mapExample = new LinkedHashMap<>(){
            {
                put("name","kmj");
                put("ph",123);

                for(Integer i : Arrays.asList(1,2,3,4)){
                    put(String.valueOf(i),"value"+i);
                }

            }
        };


        System.out.println(mapExample);


        List<Integer> listEx = Arrays.asList(1,2,3,54);


        Map<String,Object> mapEx = new HashMap<>(){
            {
                for(Integer intVar : listEx){
                    put(""+intVar , "value"+intVar);
                }
            }
        };

        System.out.println(mapEx);


//        System.out.println(mapExample);

//        for(Map.Entry<String,Object> mapEntry : mapExample.entrySet()) {
//        	
//        	System.out.println("Key "+ mapEntry.getKey() + " Value " + mapEntry.getValue());
//        	
//        }

        //   April2022 apr = new April2022(27, "andy", "IT");
        April2022 apr2 = new April2022(30, "dy2", "IT2");



        //List of Pojo class
        List<April2022> list = Arrays.asList(new April2022(27, "andy", "IT"), apr2, new April2022(31, "dy3", "IT3"),
                new April2022(34, "dy4", "IT4"));

        //convert List of POJO to list of Map
        List<Map<String,Object>> mapList = new ArrayList();

        for(April2022 listLoop : list ) {

            Map<String, Object> mapVar = new HashMap<>();
            mapVar.put("age", listLoop.getAge());
            mapVar.put("name", listLoop.getName());
            mapVar.put("work", listLoop.getWork());

            mapList.add(mapVar);

        }

        System.out.println(mapList);
        //System.out.println(list);

    }
}