package ch.juventus.se.problemstofix.calc;

import java.text.DecimalFormat;
import java.util.List;

public class Calculations {

    public double divide (double a, double b) {
        DecimalFormat df2 = new DecimalFormat("###.##");
        return Double.valueOf(df2.format(a/b));
    }

    public Double exponentiate (Double value, int exponent) {
        if (value == null) {
            return Double.valueOf(0);
        }
        Double result = new Double(value);

        for(int i = 1; i < exponent; i++) {
            result = result*value;
        }

        return result;
    }

    public double countTotal(List<BankAccount> accounts) {
        double total = 0;
        int i = 0;

        while (i < accounts.size()) {
            total += accounts.get(i).getBalance();
            i++;
        }

        return total;
    }

    public int countErrors (List<String> data) {
        int errorCount = 0;

        for (int i = 0; i < data.size(); i++) {
            if(data.get(i).contains("error")) {
                errorCount++;
            }
        }

        return errorCount;
    }

}
