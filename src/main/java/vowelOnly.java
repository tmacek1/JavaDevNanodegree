/*
    Write a method with a random string input, returns a String containing only vowels.
    Example:

    Input: “Hello World!” -> output: “eoo”

    Input: “Udacity Course” -> output: “Uaioue”

*/

public class vowelOnly {

    public static String vowelOnly(String input) {

        String vowel = "aeiou";
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if(vowel.contains(String.valueOf(c).toLowerCase())){
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {

        vowelOnly("tomislav");
    }

}
