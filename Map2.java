import java.util.HashMap;
import java.util.Map;

public class Map2 {

/*
Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
always with the value 0. For example the string "hello" makes the pair "hello":0.
We'll do more complicated counting later, but for this problem the value is simply 0.*/
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (String s:strings) {
            map.put(s, 0);
        }
        return map;
    }

/*
Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
and the value is that string's length.*/
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s:strings) {
            map.put(s, s.length());
        }
        return map;
    }

/*Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its
first character as a key with its last character as the value.*/
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for (String s:strings) {
            map.put(s.substring(0, 1), s.substring(s.length() -1));
        }
        return map;
    }

/*The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each
different string, with the value the number of times that string appears in the array.*/
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s:strings) {
            if (map.containsKey(s)) map.put(s, map.get(s) + 1);
            else map.put(s, 1);
        }
        return map;
    }

/*
Given an array of non-empty strings, return a Map<String, String> with a key for every different first
character seen, with the value of all the strings starting with that character appended together in the order
they appear in the array.*/
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for (String s:strings) {
            String firstLetter = s.substring(0, 1);
            if (map.containsKey(firstLetter)) {
                String newVal = map.get(firstLetter) + s;
                map.put(firstLetter, newVal);
            } else map.put(firstLetter, s);
        }
        return map;
    }

/*
Loop over the given array of strings to build a result string like this: when a string appears
the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string if no
string appears a 2nd time.*/

//Needed help on this one. Review!!!!
    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String result = "";
        for (String s:strings) {
            if (map.containsKey(s)) {
                int val = map.get(s) + 1;
                if (val % 2 == 0) {
                    result += s;
                }
                map.put(s, val);
            } else {
                map.put(s, 1);
            }
        }
        return result;
    }

/*Given an array of strings, return a Map<String, Boolean> where each different string is a key and its
value is true if that string appears 2 or more times in the array.*/

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        Boolean duplicateStrings;  //Originally had duplicateStrings initialized as false outside of the for loop. This caused some tests to fail.
        for (String s:strings) {
            if (map.containsKey(s)) {
                duplicateStrings = true;
            } else duplicateStrings = false;
            map.put(s, duplicateStrings);
        }
        return map;
    }

/*We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over
and then return the given array of non-empty strings as follows: if a string matches an earlier string
in the array, swap the 2 strings in the array. When a position in the array has been swapped, it no longer matches
anything. Using a map, this can be solved making just one pass over the array. More difficult than it looks.*/
    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        int count = 0;
        for (String s:strings) {          //This could be done using a standard for loop, incrementing count in the loop statement.
            String key = s.substring(0, 1);

            if (map.containsKey(key)) {
                int position = map.get(key);
                String temp = strings[position];
                strings[position] = strings[count];
                strings[count] = temp;

                map.remove(key);
            } else {
                map.put(key, count);
            }
            count++;
        }
        return strings;
    }

/*We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then
return the given array of non-empty strings as follows: if a string matches an earlier string in the array,
swap the 2 strings in the array. A particular first char can only cause 1 swap, so once a char has caused a swap, its
later swaps are disabled. Using a map, this can be solved making just one pass over the array. More difficult than it looks.*/
    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < strings.length; i++) {
            String key = strings[i].substring(0, 1);
            if (map.containsKey(key)) {
                int match = map.get(key);
                if (match == -1) {         //Set value for key as -1 for flag, continue statement breaks if and starts at else statement
                    continue;
                }
                String temp = strings[match];
                strings[match] = strings[i];
                strings[i] = temp;
                map.put(key, -1);
            } else {
                map.put(key, i);
            }
        }
        return strings;
    }

}
