package com.zhaohaijie.OracleCertifiedProfessional.JavaProgrammerIIStudy.TestingCode;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by ZHJ on 3/14/2017.
 */
public class PathTest {


    public static void main(String[] args){
        try {
            Path path1 = Paths.get("/MyGitHub/OracleCertifiedProfessional", "../").resolve(Paths.get("./ReadMe.txt")).normalize();
            Path path2 = new File("../ReadMe.txt").toPath().toRealPath();

            System.out.println(System.getProperty("user.dir"));
            System.out.println(path1);
            System.out.println(path2);

            //System.out.println(Files.isSameFile(path1, path2));
            System.out.println(" " + path1.equals(path2));
            System.out.println(path1.getFileName());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
