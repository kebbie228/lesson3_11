package com.company;

public class Main {
//the-stealth-warrior
    public static void main(String[] args) {
String s="the-stealth-warrior";
StringBuilder sb=new StringBuilder(s);

   s=s.replaceAll("-"," ");

   for(int i=0;i<s.length();i++){
    // if(s.charAt(i)==' ') s.toUpperCase(i+1);

   }
   s=s.replaceAll(" ","");

        System.out.println(s);
    }
}
