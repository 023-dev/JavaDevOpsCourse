package com.kosta.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class MapTest {
    public static void main(String[] args){
        HashMap<String, String> map
                = new HashMap<>();
        map.put("hong", "010-0000-0000");
        map.put("lim", "010-1111-1111");
        map.put("byun", "010-2222-2222");
        map.put("jho", "010-3333-3333");
        System.out.println("=====map=====");
        for (String key : map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
       Set<String> keySet = map.keySet();
        Iterator<String> keyIter = keySet.iterator();
        System.out.println("=====iter=====");
        while(keyIter.hasNext()){
            String key = keyIter.next();
            System.out.println(key+" : "+map.get(key));
        }
    }
}
