package org.mvpigs;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class RomanNumbers {

    private static boolean isValid(String number, String romanNum) {

        if(number == null || number.isEmpty() || !number.matches(romanNum)){
            return false;
        }else{
            return true;
        }
    }

    public static int romanToDecimal(String number) {
        String regularExpression = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";

        if (!isValid(number, regularExpression)){
            return -1;
        }


        final Matcher matcher = Pattern.compile("M|CM|D|CD|C|XC|L|XL|X|IX|V|IV|I").matcher(number);
        final int[] decimalNumbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] romanSimbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int result = 0;

        while(matcher.find()) {
            for (int i = 0; i < romanSimbols.length; i++) {
                if (romanSimbols[i].equals(matcher.group(0))) {
                    result += decimalNumbers[i];
                }
            }
        }
        return result;
    }



    public static void main(String args[]) {
        String romanNum = "MCLXXXII";
        System.out.println(RomanNumbers.romanToDecimal(romanNum));

    }


}
