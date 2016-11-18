
public class Strings2 {
/*Given a string, return a string where for every char in the original, there are two chars.*/
//A "+" operand could be used in place of the concat method
    public String doubleChar(String str) {
        String doubleChars = "";
        for (int i =0; i < str.length(); i++) {
            doubleChars += str.substring(i, i + 1).concat(str.substring(i, i + 1));
        }
        return doubleChars;
    }

/*Return the number of times that the string "hi" appears anywhere in the given string.*/
    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() -1; i++) {
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

        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i, i+3).contains("cat")) countCat++;
            if (str.substring(i, i+3).contains("dog")) countDog++;
        }
        if (countCat == countDog) return true;
        return false;
    }

}
