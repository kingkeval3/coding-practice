package LeetCodePractice;

import java.util.*;

class RomanToNumber {
    public static void main(String[] Args) {

        String s = "MMCDXXV";

        s = s.toUpperCase();

        List<String> substractList = Arrays.asList("I", "X", "C");
        List<String> possibleNextChars = Arrays.asList("V", "X", "L", "C", "D", "M");
        Map<String, Integer> romansMap = Map.of(
                "I", 1,
                "V", 5,
                "X", 10,
                "L", 50,
                "C", 100,
                "D", 500,
                "M", 1000
        );

        Integer romanConvertedNum = 0;

        Boolean flag = true;
        Integer i = 0;

        while (flag) {

            String currentChar = String.valueOf(s.charAt(i));

            if (!substractList.contains(currentChar)) {

                romanConvertedNum = romanConvertedNum + romansMap.get(currentChar);
                flag = i + 1 < s.length() ? flag : false;
                i++;

            } else {

                if (i + 1 < s.length()) {

                    String nextChar = String.valueOf(s.charAt(i + 1));

                    Boolean skipNext = true;

                    //5 or 9 | IV or IX
                    if (currentChar.equals("I") && nextChar.equals("V")) {
                        romanConvertedNum = romanConvertedNum + 4;
                    } else if (currentChar.equals("I") && nextChar.equals("X")) {
                        romanConvertedNum = romanConvertedNum + 9;
                    }

                    //40 or 90 | XL or XC
                    else if (currentChar.equals("X") && nextChar.equals("L")) {
                        romanConvertedNum = romanConvertedNum + 40;
                    } else if (currentChar.equals("X") && nextChar.equals("C")) {
                        romanConvertedNum = romanConvertedNum + 90;
                    }

                    //400 or 900 | CD or CM
                    else if (currentChar.equals("C") && nextChar.equals("D")) {
                        romanConvertedNum = romanConvertedNum + 400;
                    } else if (currentChar.equals("C") && nextChar.equals("M")) {
                        romanConvertedNum = romanConvertedNum + 900;
                    } else {
                        romanConvertedNum = romanConvertedNum + romansMap.get(currentChar);
                        i++;
                        skipNext = false;
                    }

                    if (skipNext) {
                        flag = i + 2 < s.length() ? flag : false;
                        i = i + 2;
                    }


                } else {
                    romanConvertedNum = romanConvertedNum + romansMap.get(currentChar);
                    flag = false;
                }

            }

        }

        System.out.println("OUTPUT:" + romanConvertedNum);

    }
}