package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Equation equation=new Equation();
        System.out.println(Arrays.toString(equation.countEquation(1, -8, 12)));
        CustomIterator iter=new CustomIterator(new String[]{"blueface","baby","bustdown"});
        System.out.println(iter.hasNext("bustdown"));
        System.out.println(iter.next("baby"));
        System.out.println(iter.delete(2));
        Collection<String> collection=new ArrayList<>();
        collection.add("1");
        collection.add("1");
        collection.add("1");
        collection.add("2");
        UniqueElem uniqueElem=new UniqueElem();
        System.out.println(uniqueElem.uniqueElem(collection));    }
}
