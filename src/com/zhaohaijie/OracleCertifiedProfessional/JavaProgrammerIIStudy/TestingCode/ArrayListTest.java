package com.zhaohaijie.OracleCertifiedProfessional.JavaProgrammerIIStudy.TestingCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZHJ on 3/14/2017.
 */
public class ArrayListTest {
    public static void main(String[] args){

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4));
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,3);
        map.put(3,3);


        System.out.println(map);
    }
}
