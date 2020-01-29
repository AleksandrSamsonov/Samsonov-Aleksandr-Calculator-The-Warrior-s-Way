package Main;

import java.math.BigDecimal;

class CalcImpl implements Calc {
    @Override
    public BigDecimal calc(int num1, int num2, char operation) {
        BigDecimal a = new BigDecimal(num1);
        BigDecimal b = new BigDecimal(num2);
        BigDecimal result = null;
        switch (operation) {
            case '+':
                result = a.add(b);
                break;
            case '-':
                result = a.subtract(b);
                break;
            case '*':
                result = a.multiply(b);
                break;
            case '/':
                result = a.divide(b, 9, BigDecimal.ROUND_CEILING);
                break;
        }
        return result;
    }
}