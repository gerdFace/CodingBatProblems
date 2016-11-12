
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
}
