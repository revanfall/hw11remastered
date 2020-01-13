package com.company;

public class CustomIterator {
    String arr[];

    public CustomIterator(String[] arr) {
        this.arr = arr;
    }

    boolean hasNext(String elem){
        boolean flag=false;
        for(int i=0;i<arr.length-1;i++){
            if(elem==arr[i])
                if(arr[i+1]!=null)
                    flag=true;
        }
        return flag;
    }
    public boolean delete(int index) {
        arr[index] = null;
        for (; index + 1 < arr.length; index++)
            arr[index] = arr[index + 1];
        return true;
    }

    public String next(String elem){
        String prev=null;
        for(int i=0;i<arr.length-1;i++){
            if(hasNext(elem)==true)
                prev=arr[i+1];
        }
        return prev;
    }
}
