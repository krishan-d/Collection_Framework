package com.learn.collection.legacy_ds;

import java.util.EnumSet;
import java.util.Iterator;

enum days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class LearnEnumSet {

    public static void main(String[] args) {

        EnumSet<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);

        // Traversing elements
        Iterator<days> iterator = set.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());

        EnumSet<days> set1 = EnumSet.allOf(days.class);
        System.out.println("Week Days:" + set1);

        EnumSet<days> set2 = EnumSet.noneOf(days.class);
        System.out.println("Week Days:" + set2);

        EnumSet<days> set3 = EnumSet.copyOf(set);
        System.out.println("Week Days:" + set3);

        EnumSet<days> set4 = EnumSet.complementOf(set);
        System.out.println("Week Days:" + set4);
    }
}
