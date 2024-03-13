package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>();
        originalList.add("apple");
        originalList.add("banana");
        originalList.add("cherry");
        originalList.add("date");

        System.out.println("Original list: " + originalList);
        Collections.reverse(originalList);

        System.out.println("Reversed list: " + originalList);
    }
}
