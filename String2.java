
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
        return (lilA.endsWith(lilB) || lilB.endsWith(lilA));
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

    /*Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
    You may assume that n is between 0 and the length of the string, inclusive.*/
    public String repeatEnd(String str, int n) {
        String lastN = "";
        for (int i = 0; i < n; i++) {
            lastN += str.substring(str.length()-n, str.length());
        }
        return lastN;
    }

    /*Given a string and an int n, return a string made of the first n characters of the string, followed by the
    first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string,
    inclusive (i.e. n >= 0 and n <= str.length()).*/
    public String repeatFront(String str, int n) {
        String lastN = "";
        int newN = n;
        for (int i = 0; i < n; i++) {
            lastN += str.substring(0, newN);
            newN--;
        }
        return lastN;
    }

    /*Given two strings, word and a separator sep, return a big string made of count occurrences of the
    word, separated by the separator string.*/
    public String repeatSeparator(String word, String sep, int count) {
        String newString = "";
        for(int i = 0; i < count; i++) {
            newString += word;
            if (i != count - 1) newString +=sep;
        }
        return newString;
    }

    /*Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string
    appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().*/
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        for (int i = 0; i < str.length() - n; i++) {
            if (str.substring(n, str.length()).contains(prefix)) return true;
        }
        return false;
    }

    /*Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of
    chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.*/
    public boolean xyzMiddle(String str) {
        if (str.length() < 3)  return false;

        int count;
        boolean isEven = false;
        if (str.length() % 2 == 0) {
            count = str.length() / 2 -2;
            isEven = true;
        } else {
            count = str.length() / 2 - 1;
        }
        return (str.substring(count, count + 3).equals("xyz")) || (isEven && str.substring(count+1, count+4).equals("xyz"));
    }

    /*A sandwich is two pieces of bread with something in between. Return the string that is between the first and last
    appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.*/
    //Use the freakin' API!!!!
    public String getSandwich(String str) {
        String emptyString = "";
        if (str.length() < 11) return emptyString;
        int firstIndex = str.indexOf("bread");
        int lastIndex = str.lastIndexOf("bread");

        if (lastIndex > firstIndex) return str.substring(firstIndex + 5, lastIndex);
        return emptyString;
    }

    /*Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the
    star, they are the same.*/
    public boolean sameStarChar(String str) {

        for (int i = 1; i < str.length() -1; i++) {
            if (str.substring(i, i +1).contains("*")) {

                if (str.charAt(i -1) != str.charAt(i + 1)) return false;
            }
        }
        return true;
    }

    /*Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields
    "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any
    group of fewer than 3 chars at the end.*/
    public String oneTwo(String str) {
        String newString = "";
        for (int i = 0; i < str.length() -2; i+=3) {
            if (!str.substring(i +2, i + 3).isEmpty()) {
                newString += str.substring(i +1, i +3) + (str.substring(i, i + 1));
            }
        }
        return newString;
    }

    /*Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
    Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".*/
    public String zipZap(String str) {
        String newString = "";
        if (str.length() < 3) return str;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'z' && str.charAt(i +2) == 'p') {
                newString += str.substring(i, i +1) + str.substring(i +2, i +3);
                i += 2;
            } else {
                newString += str.substring(i, i +1);
            }
        }
        return newString;
    }
    //The same can be achieved by using one line of code:
    return str.replaceAlll("z.p", "zp");
}