package demo1;

import java.util.HashSet;

public class UniqCollection {
    public static void main(String[] args) {

        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Name1");
        hashSet.add("Name2");
        hashSet.add("Name3");
        hashSet.add("Name4");

        for(String Name : hashSet) {
            System.out.println(Name);
        }
    }



}
