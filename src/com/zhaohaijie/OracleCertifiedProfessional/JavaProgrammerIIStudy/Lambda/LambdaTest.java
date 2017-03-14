package com.zhaohaijie.OracleCertifiedProfessional.JavaProgrammerIIStudy.Lambda;

import java.util.stream.IntStream;

/**
 * Created by ZHJ on 3/14/2017.
 */
public class LambdaTest {
    public static void main(String[] args){

        IntStream.iterate(1, i -> i + 2).limit(12).forEach(i -> System.out.println(i));

    }
}
