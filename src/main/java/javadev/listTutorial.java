package javadev;/*
    Give a list of strings, all in lowercase, and all start with an alphabet character, please group them based on their first character.
    If the first character is a, group them in a list 0. If the first character is ‘b’, group them in a list 1; other characters, group them in a list 2.

    Example1 : input: {“bcd”, “abc”, “cde”},
               output: [{“abc”}, {“bcd”}, {“cde”}]

    Example2: Input: List: {“abc”, “bcd”, “bbb”, “ace”, “snb”, “aaaa”, “bbbbb”, “eeee”}
              Output: [{“abc”, “ace”, “aaaa”}, {“bcd”, “bbb”, “bbbb”}, {“snb”, “eeee”}]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listTutorial {

    public static List<String>[] groupString(List<String> input) {

        List<String> [] resultList = new List[3];

        for(String s : input) {
            if (s.charAt(0) == 'a') {
                List <String> tempList;
                if(resultList[0] == null) {
                    tempList = new ArrayList<String>();
                } else {
                    tempList = resultList[0];
                }
                tempList.add(s);
                resultList[0] = tempList;
            } else if (s.charAt(0) == 'b') {
                List <String> tempList;
                if(resultList[1] == null) {
                    tempList = new ArrayList<String>();
                } else {
                    tempList = resultList[1];
                }
                tempList.add(s);
                resultList[1] = tempList;
            } else {
                List <String> tempList;
                if(resultList[2] == null) {
                    tempList = new ArrayList<String>();
                } else {
                    tempList = resultList[2];
                }
                tempList.add(s);
                resultList[2] = tempList;
            }
        }
        return resultList;
    }

    public static void main(String[] args) {

        List<String> input = Arrays.asList("abc", "bcd", "bbb", "ace", "snb", "aaaa", "bbbbb", "eeee");
        for (List<String> lst : groupString(input)) {
            System.out.println(lst);
            System.out.println();
        }
    }
}
