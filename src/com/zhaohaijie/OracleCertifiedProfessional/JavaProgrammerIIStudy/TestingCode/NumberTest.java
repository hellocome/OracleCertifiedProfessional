package com.zhaohaijie.OracleCertifiedProfessional.JavaProgrammerIIStudy.TestingCode;

/**
 * Created by ZHJ on 3/15/2017.
 */
public class NumberTest {
    public static void main(String[] args){

        long a = 3123456789L;
        double b = 2;
        float d = 2.1f;
        long t = 192301398193810323L;
        long q = 2;
        double c = b + 1.2f;


        short y = (short)1921222;
        //

        System.out.print("Short Max: " + Short.MAX_VALUE);
        System.out.print("y: " + y);
        Long x = 10L;
        boolean TRUE = true;
        boolean FALSE = false;

        boolean val = TRUE & FALSE;
        val = TRUE ^ FALSE;
        val = TRUE | FALSE;
        val = FALSE | FALSE;
        val = TRUE & TRUE;
        val = FALSE & FALSE;
        if(val) { // Throws an exception if x is null
            // Do something

        }

        if(x != null & x < 5) { // Throws an exception if x is null
            // Do something
        }



    }
}
