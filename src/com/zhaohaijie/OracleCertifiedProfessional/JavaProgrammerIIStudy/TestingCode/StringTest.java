package com.zhaohaijie.OracleCertifiedProfessional.JavaProgrammerIIStudy.TestingCode;

/**
 * Created by ZHJ on 3/15/2017.
 */
public class StringTest {
    public static void main(String[] args){
        String a = "a";
        String b = "a".toString();
        String c = "a";
        String d = new String("a");
        String e = new StringBuilder("a").toString();
        String f = ("a" + "").toString();
        String g = ("a" + "b").substring(0,1).toString();
        String h = ("a" + "").substring(0,0).toString();
        System.out.println("g : " + g.hashCode());
        System.out.println("a : " + a.hashCode());

        System.out.println("a==b : " + (a == b));
        System.out.println("a==c : " + (a == c));
        System.out.println("a==d : " + (a == d));
        System.out.println("a==e : " + (a == e));
        System.out.println("a==f : " + (a == f));
        System.out.println("a==g : " + (a == g));
        System.out.println("a==h : " + (a == h));
    }
}
