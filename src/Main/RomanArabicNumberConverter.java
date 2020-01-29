package Main;

import java.util.ArrayList;

class RomanArabicNumberConverter implements ConverterNumber {

    @Override
    public int convert(String romeValue) {
        int arabicNumber = 0;
        int subtractionRuleNumber = 0;

        ArrayList<String> romeList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            romeList.add(i, "");
        }
        romeList.set(1, "I");
        romeList.set(5, "V");
        romeList.set(10, "X");

        for (int marker = romeValue.length(); marker > 0; marker--) {
            String romanSymbol = romeValue.substring(marker - 1, marker);
            int valueRomeNumber = romeList.indexOf(romanSymbol);

            if (valueRomeNumber >= subtractionRuleNumber
            ) {
                arabicNumber += valueRomeNumber;
            } else {
                arabicNumber -= valueRomeNumber;
            }
            subtractionRuleNumber = valueRomeNumber;
        }
        return arabicNumber;
    }

    @Override
    public String reverseConvert(int value) {
        StringBuilder result = new StringBuilder();
        while (value > 0) {
            if ((value / 100) >= 1) {
                result.append("C");
                value = value - 100;
            } else if ((value / 50) >= 1) {
                result.append("L");
                value = value - 50;
            } else if ((value / 10) >= 1) {
                result.append("X");
                value = value - 10;
            } else {
                switch ((value)) {
                    case 9:
                        result.append("IX");
                        value = value - 9;
                        break;
                    case 8:
                        result.append("VIII");
                        value = value - 8;
                        break;
                    case 7:
                        result.append("VII");
                        value = value - 7;
                        break;
                    case 6:
                        result.append("VI");
                        value = value - 6;
                        break;
                    case 5:
                        result.append("V");
                        value = value - 5;
                        break;
                    case 4:
                        result.append("IV");
                        value = value - 4;
                        break;
                    case 3:
                        result.append("III");
                        value = value - 3;
                        break;
                    case 2:
                        result.append("II");
                        value = value - 2;
                        break;
                    case 1:
                        result.append("I");
                        value = value - 1;
                        break;
                }
            }
        }
        return result.toString();
    }
}
