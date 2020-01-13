package com.company;

import java.util.Collection;
import java.util.HashSet;

public class UniqueElem {
    public Collection uniqueElem(Collection collection){
        Collection hashSet=new HashSet<>(collection);
        collection=hashSet;
        return collection;
    }
}
