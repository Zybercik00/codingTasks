package leetcode;

import java.util.Arrays;

public class Test {



    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
        System.out.println("***************");
        System.out.println(dir);
        System.out.println("***************");
        String txt1 = "jakiś_tek_st";
        StringBuilder targetTxt = new StringBuilder();
        boolean first = true;
        boolean afterUnderscore = false;
        for (int i = 0; i < txt1.length(); i++) {
            char c = txt1.charAt(i);
            if ((first || afterUnderscore) && Character.isAlphabetic(c)) {
                targetTxt.append(Character.toUpperCase(c));
                first = false;
                afterUnderscore = false;
            } else if (c == '_') {
                afterUnderscore = true;
            } else if (Character.isAlphabetic(c)) {
                targetTxt.append(Character.toLowerCase(c));
            }
        }
        String result = targetTxt.toString();
        System.out.println("result: " + result);

        // second way, use stream
//        String[] words = txt1.split("_");
//        for (String word : words) {
//            System.out.println(word);
        }


    }



