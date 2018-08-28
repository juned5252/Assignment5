package ArrayListDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class arrayListMain {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Text 1");
        list.add("Text 2");
        list.add("Text 3");

        System.out.println("while loop\n");
        int j = 0;
        while (list.size() > j) {
            System.out.println(list.get(j));
            j++;
        }

    }
}
