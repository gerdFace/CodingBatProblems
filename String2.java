
public class String2 {
    /*Given a string, return a string where for every char in the original, there are two chars.*/
    //A "+" operand could be used in place of the concat method
    public String doubleChar(String str) {
        String doubleChars = "";
        for (int i = 0; i < str.length(); i++) {
            doubleChars += str.substring(i, i + 1).concat(str.substring(i, i + 1));
        }
        return doubleChars;
    }

    /*Return the number of times that the string "hi" appears anywhere in the given string.*/
    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).contains("hi")) {
                count++;
            }
        }
        return count;
    }

    /*Return true if the string "cat" and "dog" appear the same number of times in the given string.*/
    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).contains("cat")) countCat++;
            if (str.substring(i, i + 3).contains("dog")) countDog++;
        }
        if (countCat == countDog) return true;
        return false;
    }

    /*Return the number of times that the string "code" appears anywhere in the given string, except we'll
    accept any letter for the 'd', so "cope" and "cooe" count.*/
    public int countCode(String str) {
        int countStr = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).contains("co") && str.substring(i + 3, i + 4).contains("e")) countStr++;
        }
        return countStr;
    }

    /*Given two strings, return true if either of the strings appears at the very end of the other string,
    ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
    Note: str.toLowerCase() returns the lowercase version of a string.*/
    public boolean endOther(String a, String b) {
        String lilA = a.toLowerCase();
        String lilB = b.toLowerCase();
        if (lilA.endsWith(lilB) || lilB.endsWith(lilA)) return true;
        return false;
    }

    /*Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded
    by a period (.). So "xxyz" counts but "x.xyz" does not.*/
    public boolean xyzThere(String str) {
    //First tried without continue, tests failed. Then tried with 2 counters to avoid loop issues, tests failed.
    //Finally, tried nested if statement with continue so not to return true if "." was present.
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                if (i > 0 && str.substring(i - 1, i).equals(".")) continue;
                return true;
            }
        }
        return false;
    }

    /*Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.*/
    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 1).equals("b") && str.substring(i + 2, i + 3).equals("b")) return true;
        }
        return false;
    }

    /*We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char
    somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true
    if the given string is xy-balanced.*/
    public boolean xyBalance(String str) {
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.substring(i, i + 1).equals("x")) {
                if (!str.substring(str.length() - 1).equals("x") && str.substring(i + 1).contains("y")) continue;
                return false;
            }
        }
        return true;
    }
    //OR for a cleaner loop
    public boolean xyBalance(String str) {
        int x = 0;
        for (int i = str.length(); i > 0; i--) {
            if (str.substring(i - 1, i).equals("x")) x = i;
            if (str.substring(i - 1, i).equals("y") && i > x) break;
            if (x >= i) return false;
        }
        return true;

        //USE THE API!!!

    public boolean xyBalance(String str) {
        int indexY = str.lastIndexOf("y");
        int indexX = str.lastIndexOf("x");

        if (indexY < indexX) return false;
        return true;
    }

    /*Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char
    of a, the second char of b, and so on. Any leftover chars go at the end of the result.*/
    //This was way to complicated. Simplified below.
    public String mixString(String a, String b) {
        String newString = "";
        int shortString = Math.min(a.length(), b.length());
        int longString = Math.max(a.length(), b.length());
        for (int i = 0; i < shortString; i++) {
            newString += a.substring(i, i + 1) + b.substring(i, i + 1);
        }
        if (a.length() > b.length()) return newString + a.substring(shortString);
        return newString + b.substring(shortString);
    }

    //Simplified version:
    public String mixString(String a, String b) {
        String newString = "";
        for (int i = 0; i < Math.max(a.length(), b.length()); i++) {
            if (i < a.length()) newString += a.substring(i, i + 1);
            if (i < b.length()) newString += b.substring(i, i + 1);
        }
        return newString;
    }
}