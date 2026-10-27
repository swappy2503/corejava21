package service;

import util.TestClass;

import java.util.StringTokenizer;

public class ServiceTestClass {
    static void main() {
  //    String str=new String("Hello");
        StringTokenizer st=new StringTokenizer("Hello,World",",");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}