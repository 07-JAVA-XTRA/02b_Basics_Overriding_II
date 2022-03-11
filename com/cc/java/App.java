package com.cc.java;

public class App {
    public static void main(String[] args) {
      
    //  Level_0 player = new Level_0();
    //  ausgabe(player.play());  

        ausgabe(String.valueOf(2));
        ausgabe(2);
        // 1. Typumwandlung int --> String
        // 2. Overloading

    }

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }

    private static void ausgabe(int boo) {
        System.out.println(boo);
    }


}
