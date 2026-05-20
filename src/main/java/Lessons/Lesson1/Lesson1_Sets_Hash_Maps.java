package Lessons.Lesson1;

import com.github.javafaker.Faker;

import java.util.*;

public class Lesson1_Sets_Hash_Maps {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        List<String> names = new LinkedList<String>();

        Faker faker = new Faker();

        for (int i = 0; i < 100; i++) {
            names.add(faker.name().firstName());
        }

        System.out.println(names);
//        names = List.of("Shai", "Sergey");

        for (String name : names)
        {
            Integer currentValue = 0;
            for (char c : name.toCharArray())
            {
                currentValue = map.get(c);
                if  (currentValue == null)
                {
                    currentValue = 0;
                }
                map.put(c, currentValue + 1);
            }
        }

        System.out.println(map);
    }
}
