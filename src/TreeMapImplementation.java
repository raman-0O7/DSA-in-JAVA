import java.util.TreeMap;

public class TreeMapImplementation {
    public static void main(String[] args) {
        //Tree map arrange all items in sorted order according to keys value

        TreeMap<Integer, String> map =  new TreeMap<>();
        map.put(5, "Rahul");
        map.put(7 ,"Lakshman");
        map.put(1, "Ram");
        map.put( 4, "Krrish");
        map.put(2, "Laay");
        System.out.println(map);
    }
}
