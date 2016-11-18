
public class String1 {
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

    //return String word in the middle of String out
    public String makeOutWord(String out, String word) {
        String firstPart = out.substring(0, 2);
        String lastPart = out.substring(2);
        return firstPart.concat(word).concat(lastPart);
    }

    //return 3 copies of last two letters of str
    public String extraEnd(String str) {
        String newStr = str.substring(Math.max(str.length() - 2, 0));
        return newStr.concat(newStr).concat(newStr);
    }

    /*return first two chars of a string --if less than 2 chars long return
        original string*/
    public String firstTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        }
        return str;
    }

    /*given a string of even length return the first half*/
    public String firstHalf(String str) {
        int firstPart = str.length() / 2;
        return str.substring(0, firstPart);
    }

    /*given a string return a version without the first or last characters*/
    public String withoutEnd(String str) {
        int allButLast = str.length() - 1;

        return str.substring(1, allButLast);
    }

    /*given 2 strings, a and b, return short+long+short*/
    public String comboString(String a, String b) {
        int maybeShort = a.length();
        int maybeLong = b.length();

        if (maybeShort < maybeLong) {
            return a + b + a;
        }
        return b + a + b;
    }

    /*concatenate 2 strings except omit the first char of each*/
    public String nonStart(String a, String b) {
        String oneNoFirstChar = a.substring(1);
        String twoNoFirstChar = b.substring(1);

        return oneNoFirstChar.concat(twoNoFirstChar);
    }

    /*given a string, return a "rotated left 2" version where first two
    * chars are moved to the end*/
    public String left2(String str) {
        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        String noFirstTwoChars = str.substring(2);

        return noFirstTwoChars + firstChar + secondChar;
    }
/*simpler solution:
    public String left2(String str) {
      return str.substring(2) + str.substring(0, 2);
    }*/

    /*given a string, return a "rotated right 2" version where last two
    * chars are moved to the front*/
    public String right2(String str) {
        int lengthOfString = str.length();
        int numberWithoutLastTwo = lengthOfString - 2;
        String stringNoLastTwoChars = str.substring(0, numberWithoutLastTwo);

        return str.substring(numberWithoutLastTwo, lengthOfString) + stringNoLastTwoChars;
    }

    /*given a string, return a string length 1 from the front, unless front is
    * false, then return string length 1 from its back*/
    public String theEnd(String str, boolean front) {
        int lastChar = str.length();
        if (front) {
            return str.substring(0, 1);
        }
        if (!front) {
            return str.substring(lastChar -1);
        }
        return str;
    }

    /*given a string, return a version without the first and last char of the
    * string. the string may be length 0*/
    public String withouEnd2(String str) {
        if (str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length() -1);
    }

    /*given a string of even length, return the middle two chars. string
    * length is at least 2*/
    public String middleTwo(String str) {
        int middleLeft = str.length() / 2 -1;
        int middleRight = str.length() /2 + 1;

        return str.substring(middleLeft, middleRight);
    }

    /*return true if given string ends with "ly"*/
    public boolean endsLy(String str) {
        boolean endLy = str.endsWith("ly");
        return endLy;
    }

    /*given a string and an int n, return a string made of the first and last n chars
    * from the string. string length will be at least n*/
    public String nTwice(String str, int n) {
        int endOfString = str.length() - n;
        String firstPart = str.substring(0, n);
        String lastPart = str.substring(endOfString);

        if (endOfString >= 0) {
            return firstPart.concat(lastPart);
        }
        return str;
    }

    /*given a string and an index, return a string length 2 starting at the
    * given index. if the index is too big or too small to define a string
    * length 2, use the first 2 chars. the string length will be at least 2*/
    public String twoChar(String str, int index) {
        int indexPlus2 = index + 2;
        double twoLessStringLength = str.length() - 2;

        if (index > 0 && index <= twoLessStringLength) {
            return str.substring(index, indexPlus2);
        }
        return str.substring(0, 2);
    }
    /*given a string of odd length, return the string length 3 from its middle,
    * string will be at least 3*/
    public String middleThree(String str) {
        int startingPoint = (str.length() / 2) - 1;
        int endingPoint = startingPoint + 3;
        return str.substring(startingPoint, endingPoint);
    }

    /*given a string return tru if "bad" appears at index 0 or 1. string
    * may be any length including 0*/
    public boolean hasBad(String str) {
        String bad = "bad";

        if (str.length() >= 3 && str.substring(0, 3).contains(bad)) {
            return true;
        } else if (str.length() >= 4 && str.substring(1, 4).contains(bad)) {
            return true;
        } else {
            return false;
        }
    }

    /*given a string, return a string length 2 made of its first 2 chars.
    * if the string length is less than 2, use @ for the missing chars*/
    public String atFirst(String str) {
        String stringIsZero = "@@";

        if (str.length() == 1) {
            return str.concat("@");
        } else if (str.length() == 0) {
            return stringIsZero;
        }
        return str.substring(0, 2);
    }

    /*given 2 strings, a and b, return a new string made of the first char
    * of a and the last char of b. if either is length 0 replace with '@'*/
    public String lastChars(String a, String b) {
        String oneIsEmpty = "@";
        String bothAreEmpty = "@@";

        if (a.isEmpty() && b.isEmpty()) {
            return bothAreEmpty;
        } else if (a.isEmpty()) {
            return oneIsEmpty + b.substring(b.length() - 1, b.length());
        } else if (b.isEmpty()) {
            return a.substring(0, 1) + oneIsEmpty;
        }
        return a.substring(0, 1) + b.substring(b.length() - 1, b.length());
    }

    /*
    Given two strings, append them together (known as "concatenation") and
    return the result. However, if the concatenation creates a double-char,
    then omit one of the chars, so "abc" and "cat" yields "abcat".*/
    public String conCat(String a, String b) {
        if (a.isEmpty()) {
            return b;
        } else if (b.isEmpty()) {
            return a;
        } else if (a.substring(a.length() - 1, a.length()).equals(b.substring(0, 1))) {
            return a.substring(0, a.length() - 1).concat(b);
        }
        return a.concat(b);
    }

    /*
    Given a string of any length, return a new string where the last 2 chars, if
    present, are swapped, so "coding" yields "codign".*/
    public String lastTwo(String str) {
        String emptyString = "";

        if (str.length() > 1) {
            String firstPart = str.substring(0, str.length() - 2);
            String secondToLastChar = str.substring(str.length() -2, str.length() - 1);
            String lastChar = str.substring(str.length() - 1, str.length());
            return firstPart + lastChar + secondToLastChar;
        } else if (str.length() == 1) {
            return str;
        }
        return emptyString;
    }

    /*Given a string, if the string begins with "red" or "blue" return that color
    string, otherwise return the empty string.*/
    public String seeColor(String str) {
        String blue = "blue";
        String red = "red";
        String empty = "";

        if (str.startsWith("blue")) {
            return blue;
        } else if (str.startsWith("red")) {
            return red;
        }
        return empty;
    }

    /*Given a string, return true if the first 2 chars in the string also appear at
    the end of the string, such as with "edited".*/
    public boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }

        String firstTwo = str.substring(0, 2);
        String lastTwo = str.substring(str.length() - 2);
        return(firstTwo.equals(lastTwo));
    }

    /*
    Given two strings, append them together (known as "concatenation")
    and return the result. However, if the strings are different lengths, omit chars
    from the longer string so it is the same length as the shorter string. So "Hello"
    and "Hi" yield "loHi". The strings may be any length.*/
    public String minCat(String a, String b) {
        if (a.length() == b.length()) {
            return a.concat(b);
        }

        int sizeDifference = Math.abs(a.length() - b.length());
        if (a.length() > b.length()) {
            return a.substring(sizeDifference) + b;
        }
        return a + b.substring(sizeDifference);
    }

    /*
    Given a string, return a new string made of 3 copies of the first 2 chars of
    the original string. The string may be any length. If there are fewer than 2 chars, use
    whatever is there.*/
    public String extraFront(String str) {
        if (str.length() < 2) {
            return str.concat(str).concat(str);
        }

        String firstTwo = str.substring(0, 2);
        return firstTwo.concat(firstTwo).concat(firstTwo);
    }

    /*
    Given a string, if a length 2 substring appears at both its beginning and end, return a string without
    the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself,
    so "Hi" yields "". Otherwise, return the original string unchanged.*/
    public String without2(String str) {
        String emptyString = "";

        if (str.length() == 2) {
            return emptyString;
        } else if (str.length() <= 1) {
            return str;
        }

        String firstTwo = str.substring(0, 2);
        String lastTwo = str.substring(str.length() - 2, str.length());

        if (firstTwo.equals(lastTwo)) {
            return str.substring(2);
        }
        return str;
    }

    /*
    Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a'
    and keep the second char if it is 'b'. The string may be any length. Harder than it looks.*/
    public String deFront(String str) {
        String emptyString = "";
        if (str.length() < 2) {
            return emptyString;
        }

        String firstChar = str.substring(0, 1);
        String secondChar = str.substring(1, 2);
        String a = "a";
        String b = "b";
        String minusFirstTwo = str.substring(2);

        if (firstChar.equals(a) && !secondChar.equals(b)) {
            return a + minusFirstTwo;
        } else if (!firstChar.equals(a) && secondChar.equals(b)) {
            return b + minusFirstTwo;
        } else if (firstChar.equals(a) && secondChar.equals(b)) {
            return a + b + minusFirstTwo;
        }
        return minusFirstTwo;
    }

    /*Given a string and a second "word" string, we'll say that the word matches the string
    if it appears at the front of the string, except its first char does not need to match exactly.
    On a match, return the front of the string, or otherwise return the empty string. So, so with the string
    "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.*/
    public String startWord(String str, String word) {
        String emptyString = "";
        if (str.length() < 1) {
            return emptyString;
        }

        String strAfter1 = str.substring(1);
        String wordAfter1 = word.substring(1);

        if (strAfter1.contains(wordAfter1)) {
            return str.substring(0, word.length());
        }
        return emptyString;
    }

    /*
    Given a string, if the first or last chars are 'x', return the string without those 'x'
    chars, and otherwise return the string unchanged.*/
    public String withoutX(String str) {
        String badChar = "x";
        String emptyString = "";

        if (str.length() < 1) {
            return str;
        } else if (str.length() == 1 && str.equals(badChar)) {
            return emptyString;
        }

        String firstLetter = str.substring(0, 1);
        String lastLetter = str.substring(str.length() - 1, str.length());

        if (firstLetter.equals(badChar) && !lastLetter.equals(badChar)) {
            return str.substring(1);
        } else if (!firstLetter.equals(badChar) && lastLetter.equals(badChar)) {
            return str.substring(0, str.length() - 1);
        } else if (firstLetter.equals(badChar) && lastLetter.equals(badChar)) {
            return str.substring(1, str.length() - 1);
        }
        return str;
/*Much simpler solution:
* public String withoutX(String str) {
  if (str.length() > 0 && str.charAt(0) == 'x') {
    str = str.substring(1);
  }

  if (str.length() > 0 && str.charAt(str.length()-1) == 'x') {
    str = str.substring(0, str.length()-1);
  }

  return str;*/
    }

    /*
    Given a string, if one or both of the first 2 chars is 'x', return the
    string without those 'x' chars, and otherwise return the string unchanged. This is a
    little harder than it looks.*/
    public String withoutX2(String str) {
        String emptyString = "";

        if (str.length() < 1) {
            return str;
        }
        if (str.length() == 1 && str.charAt(0) == 'x') {
            return emptyString;
        }
        if (str.charAt(0) == 'x' && str.charAt(1) != 'x') {
            return str.substring(1);
        }
        if (str.charAt(0) != 'x' && str.charAt(1) == 'x') {
            return str.substring(0, 1).concat(str.substring(2));
        }
        if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
            return str.substring(2);
        }
        return str;
    }

}
