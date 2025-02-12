package gr.aueb.cf.ch19.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZeroLengthAssertion {

    public static void main(String[] args) {
        String s = "BCd";

        // Check for
        // 4 or more letters
        // 1 small letter
        // ? = is zero length assertion
        Pattern pattern = Pattern.compile("^(?=.*?[a-z]).{4,}$");  // like match & reluctant
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
