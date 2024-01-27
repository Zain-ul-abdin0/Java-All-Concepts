import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifieableList {
    public static void main(String[] args){
        List<String> fruits = new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Apple");

        List<String> finalList = Collections.unmodifiableList(fruits);
//        finalList.add("Mango");
        System.out.println(finalList);
    }
}
