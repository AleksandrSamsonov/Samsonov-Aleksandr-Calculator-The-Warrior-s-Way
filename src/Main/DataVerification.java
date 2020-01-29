package Main;

import java.util.regex.Matcher;

public interface DataVerification {
    Boolean isRomanNumber(String valueStr);

    Boolean isArabicNumber(String valueStr);

    Matcher getMatcherRomanNumber(String valueStr);

    Matcher getMatcherArabicNumber(String valueStr);
}
