/*
 * @Class: Weekend Method Homework
 * @author: Anjola Akinbulumo
 * @Course: ITEC 2140-04, Spring 2023
 * @written: March 27, 2023
 */
public class myAssignment {
    public static void main(String[] args) {
myAssignment ma = new myAssignment();

String name = ma.reverseStr("Anjola");
System.out.println(name);


int num = ma.sumDigits(246810);
System.out.println(num);


String birthdayn = ma.birthdayName("Daniel");
System.out.println(birthdayn);


String swap = ma.swapEnds("Akinbulumo");
System.out.println(swap);


int fib = ma.fibonacci(16);
System.out.println(fib);


String everyO = ma.everyOther("Chocolate");
System.out.println(everyO);


String nonstart = ma.nonStart("Akinbulumo", "Anjola");
System.out.println(nonstart);


int luckyS = ma.luckySum(16, 12, 3);
System.out.println(luckyS);


boolean hasP = ma.hasPalindrome("level");
System.out.println(hasP);


boolean pot = ma.powerOfTwo(16);
System.out.println(pot);




    }
    // Reverse string Method
    public String reverseStr(String x) {
        String result = "";
        for (int i = x.length() - 1; i >= 0; i--) {
            result += x.charAt(i) + "" + x.charAt(i);
        }
        return result;
    }



    // Sum Digits Method
    public int sumDigits(int n) {

        if (n == 0) {
            return 0;
        } else {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }

    }


    // Birthday Name method
    public String birthdayName(String name){
        return "Happy Birthday " + name + "!";
    }
    //Missing front Method
    public String missingFront(String str){
        return str.substring(3);
    }


    //Swap ends method
    public static String swapEnds(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            String middle = str.substring(1, str.length() - 1);
            return last + middle + first;
        }
    }
    //fibonacci method
    public int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative.");
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            for (int i = 2; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }


    //Every Other Method
    public String everyOther(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }
        return result;
    }


    //NonStart method
    public String nonStart(String a, String b) {
        if(a.length() < 2 || b.length() < 2){
            return "";
        }
        else  {
            a = a.substring(1);
            b = b.substring(1);

            return a+b;
        }
    }


    //luckySum Method
    public int luckySum(int a, int b, int c) {
        if (a == 13){
            return 0;
        }
        else if (b == 13){
            return a;
        }
        else if (c == 13){
            return a + b;
        }
        else {
            return a + b + c;
        }

    }
//hasPalindrome
public boolean hasPalindrome(String str) {
    str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
    for (int i = 0; i < str.length(); i++) {
        // check for odd-length palindromes
        int left = i - 1;
        int right = i + 1;
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            return true;
        }
        // check for even-length palindromes
        left = i;
        right = i + 1;
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            return true;
        }
    }
    return false;
}

    //Power of two method
    public  boolean powerOfTwo(int n) {
        if (n == 0) {
            return false;
        } else {
            do {
                if (n == 1) {
                    return true;
                } else if (n % 2 != 0) {
                    return false;
                }
                n /= 2;
            } while (true);
        }
    }


}
