
public class String3 {

    /*Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez"
    count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is
    not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic
    letter.)*/
    public int countYZ(String str) {
        int countYZ = 0;
        str = str.toLowerCase() + " ";
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == 'z' || str.charAt(i) == 'y') && !Character.isLetter(str.charAt(i + 1))) {
                countYZ++;
            }
        }
        return countYZ;
    }

    /*Given two strings, base and remove, return a version of the base string where all instances of the remove string
    have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only
    non-overlapping instances, so with "xxx" removing "xx" leaves "x".*/
    public String withoutString(String base, String remove) {
        String withoutRemove = "";
        int removeIndex = base.toLowerCase().indexOf(remove.toLowerCase());

        while (removeIndex != -1) {
            withoutRemove += base.substring(0, removeIndex);
            base = base.substring(removeIndex + remove.length());
            removeIndex = base.toLowerCase().indexOf(remove.toLowerCase());
        }
        return withoutRemove + base;
    }

    /*Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number
    of appearances of "not" anywhere in the string (case sensitive).*/
    public boolean equalIsNot(String str) {
        int countIs = 0;
        int countNot = 0;

        while (str.contains("is")) {
            countIs++;
            str = str.substring(0, str.indexOf("is")) + str.substring(str.indexOf("is") + 2);
        }

        while (str.contains("not")) {
            countNot++;
            str = str.substring(0, str.indexOf("not")) + str.substring(str.indexOf("not") + 3);
        }
        return (countIs == countNot);
    }

//    Better solution using only one for loop:
    public boolean equalIsNot(String str) {
        int countIs = 0;
        int countNot = 0;
//        Lengthen string by one character that is not in "is" or "not" to avoid second for loop
        str = str + "X";
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals("is")) countIs++;
            if (str.substring(i, i + 3).equals("not")) countNot++;
        }
        return (countIs == countNot);
    }

    /*We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
    Return true if all the g's in the given string are happy.*/
    public boolean gHappy(String str) {
        int unhappyG = 0;
        str = "X" + str + "X";
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'g' && str.charAt(i-1) != 'g' && str.charAt(i+1) != 'g') {
                unhappyG++;
            }
        }
        return (unhappyG == 0);
    }

    /*We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in
    the given string. The triples may overlap.*/
    public int countTriple(String str) {
        int tripleCount = 0;

        if (str.length() < 3) {
            tripleCount = 0;
        }

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2)) {
                tripleCount++;
            }
        }

        return tripleCount;
    }

    /*Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
    Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars
    '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)*/
    public int sumDigits(String str) {
        int sumOfDigits = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sumOfDigits += Integer.parseInt(str.substring(i, i + 1));
            }
        }
        return sumOfDigits;
    }

}

