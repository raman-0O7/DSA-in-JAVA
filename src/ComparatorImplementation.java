import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorImplementation {
    public static void main(String[] args) {
        Comparator<String> com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String)o1;
                String s2 = (String)o2;
                if(s1.length() > s2.length()) return 1;
                else return -1;
            }
        };

        List<String> al = new ArrayList<>();
        al.add("Raman");
        al.add("hell");
        al.add("hello world");
        al.add("learning java");
        al.add("rashmi");
        al.add("nice Work");

        Collections.sort(al, com);

        System.out.println(al);
    }
}
