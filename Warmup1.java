public class Warmup1 {

/*CodingBat problem --must return first and second character if they
* are 'o' or 'z', respectively.*/
    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0)== 'o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)== 'z') {
            result = result + str.charAt(1);
        }
        return result;
    }

/*We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 2 int values, return true if one or the other is teen, but not both.*/
    public boolean loneTeen(int a, int b) {
        boolean isTeenA = a >= 13 && a <= 19;
        boolean isTeenB = b >= 13 && b <= 19;
        return (isTeenA || isTeenB) && !(isTeenA && isTeenB);
    }

/*Given a string, if the string "del" appears starting at index 1, return a
string where that "del" has been deleted. Otherwise, return the string unchanged.*/
    public String delDel(String str) {
        if (str.length() <= 3) {
            return str;
        }
        String findDel = str.substring(1, 4);
        if (findDel.equals("del")) {
            return str.substring(0, 1).concat(str.substring(4));
        }
        return str;
    }

    /*Given three int values, a b c, return the largest.*/
    public int intMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    /*Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
    Note that Math.abs(n) returns the absolute value of a number.*/

    public int close10(int a, int b) {
        int absoluteValueA = Math.abs(10 - a);
        int absoluteValueB = Math.abs(10 - b);

        if (absoluteValueA > absoluteValueB) {
            return b;
        }
        if (absoluteValueA < absoluteValueB) {
            return a;
        } else {
            return 0;
        }
    }

    /*Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range
    40..50 inclusive.*/
    public boolean in3050(int a, int b) {
        if ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) {
            return true;
        }
        if ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)) {
            return true;
        } else {
            return false;
        }
    }

    /*Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if
    neither is in that range.*/
    public int max1020(int a, int b) {
        int maxValue = Math.max(a, b);
        int minValue = Math.min(a, b);

        if (maxValue >= 10 && maxValue <= 20) {
            return maxValue;
        }
        if (minValue >= 10 && minValue <= 20) {
            return minValue;
        } else {
            return 0;
        }
    }

    /*Return true if the given string contains between 1 and 3 'e' chars.*/
    public boolean stringE(String str) {
        int eCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                eCount++;
            }
        }
        return (eCount >= 1 && eCount <= 3);
    }

    /*Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
    Note that the % "mod" operator computes remainders, so 17 % 10 is 7.*/
    public boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
    }

    /*Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3
    chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.*/
    public String endUp(String str) {
        if (str.length() > 3) {
            String temp = str.substring(str.length() - 3, str.length()).toUpperCase();
            return str.substring(0, str.length() - 3) + temp;
        } else {
            return str.toUpperCase();
        }
    }

    /*Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of
    the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.*/
    public String everyNth(String str, int n) {
        String stringNth = "";
        for (int i = 0; i < str.length(); i = i + n) {
            stringNth += str.charAt(i);
        }
        return stringNth;
    }

}
