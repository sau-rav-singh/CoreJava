package ConceptsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Lists {
    public static void main(String[] args) {
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());
        syncList.add(2);
        syncList.add(3);
        for (Integer i : syncList) {
            System.out.println("Sync List Element" + i);
        }
        CopyOnWriteArrayList<String> empList=new CopyOnWriteArrayList<>();
        empList.add("Tom");
        empList.add("Steve");
        empList.forEach(System.out::println);

    }
}
