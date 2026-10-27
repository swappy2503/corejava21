package service;

import util.TestClass;

import java.util.StringTokenizer;

public class ServiceTestClass {
    static void main() {
        StringTokenizer st=new StringTokenizer("Hello,World",",");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}