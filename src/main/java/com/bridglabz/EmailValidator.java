package com.bridglabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    private static final String EMAIL_PATTERN = "^[a-z]+[_+-.]?[0-9a-z]+?[@][0-9a-z]+[.][a-z]{2,}([.][a-z]{2,})?[,]?";

    public boolean validateEmail(String eMail) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(eMail);
        return matcher.matches();
    }
}

