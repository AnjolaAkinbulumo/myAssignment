public class myAssignment {
    public static void main(String[] args) {
System.out.println(reverseStr("Anjola"));
System.out.println(sumDigits(23445));
System.out.println(birthdayName("Anjola"));
System.out.println(swapEnds("Akinbulumo"));
System.out.println(fibonacci(3));
System.out.println(everyOther("Chocolate"));
System.out.println(nonStart("Anjola","Akinbulumo"));
System.out.println(luckySum(7,9, 8));
System.out.println(hasPalindrome("Mountains"));
System.out.println(powerOfTwo(520));



    }
    // Reverse string Method
    public static String reverseStr(String x) {
        String result = "";
        for (int i = x.length() - 1; i >= 0; i--) {
            result += x.charAt(i) + "" + x.charAt(i);
        }
        return result;
    }



    // Sum Digits Method
    public static int sumDigits(int n) {

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
    public static String birthdayName(String name){
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
    public static int fibonacci(int n) {
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
    public static String everyOther(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }
        return result;
    }


    //NonStart method
    public static String nonStart(String a, String b) {
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
    public static int luckySum(int a, int b, int c) {
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
public static boolean hasPalindrome(String str) {
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
    public static boolean powerOfTwo(int n) {
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
