package Main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DataVerificationArabicRomanNumber implements DataVerification {
    private String regexpArabicNum = "^[ ]*([1-9]|10)[ ]*([+-/\\\\*])[ ]*([1-9]|10)[ ]*$";
    private String regexpRomeNum = "^[ ]*(V?I|V?I{2}|V?I{3}|IV|V|IX|X)[ ]*([+-/\\\\*])[ ]*(V?I|V?I{2}|V?I{3}|IV|V|IX|X)[ ]*$";
    private Pattern pattern;
    private Matcher matcherNumber;

    @Override
    public Boolean isRomanNumber(String valueStr) {
        pattern = Pattern.compile(regexpRomeNum);
        matcherNumber = pattern.matcher(valueStr);
        return matcherNumber.find();
    }

    @Override
    public Boolean isArabicNumber(String valueStr) {
        pattern = Pattern.compile(regexpArabicNum);
        matcherNumber = pattern.matcher(valueStr);
        return matcherNumber.find();
    }

    @Override
    public Matcher getMatcherArabicNumber(String valueStr) {
        pattern = Pattern.compile(regexpArabicNum);
        matcherNumber = pattern.matcher(valueStr);
        return matcherNumber.find() ? matcherNumber : null;
    }

    @Override
    public Matcher getMatcherRomanNumber(String valueStr) {
        pattern = Pattern.compile(regexpRomeNum);
        matcherNumber = pattern.matcher(valueStr);
        return matcherNumber.find() ? matcherNumber : null;
    }
}