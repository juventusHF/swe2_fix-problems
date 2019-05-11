package ch.juventus.se.problemstofix.calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculationsTest {

    private Calculations c;
    private BankAccount bankAccount;
    private List<BankAccount> accounts;
    private List<String> textData;

    @BeforeEach
    public void setup () {
        c = new Calculations();
        bankAccount = new BankAccount(100.00);
        accounts = new ArrayList<>();
        textData = new ArrayList<>();
    }

    @Test
    public void shouldDivideAndRound () {
        double result = c.divide(33, 5.2);
        assertEquals(6.35, result, "Result of division not as expected.");
    }

    @Test
    public void shouldCalculateTotalOfAllAccounts () {
        accounts.add(new BankAccount(56.00));
        accounts.add(new BankAccount(100.00));

        double total = c.countTotal(accounts);

        assertEquals(total, 156.00, "Total of all bank accounts is not correct");
    }

    @Test
    public void shouldCountAllErrors () {
        textData.add("info");
        textData.add("warn");
        textData.add("error");
        textData.add("error");
        textData.add("debug");
        textData.add("info");
        textData.add("debug");
        textData.add("error");

        int errorCount = c.countErrors(textData);

        assertEquals(errorCount, 3, "Error count not correct!");
    }

    @Test
    public void shouldThrowInsufficientFundsException () throws InsufficientFundsException{
        assertThrows(InsufficientFundsException.class, () -> bankAccount.withdraw(160.00));
    }

    @Test
    public void shouldExponentiate () {
        Double result = c.exponentiate(new Double(2), 2);
        assertEquals(new Double(4), result);
    }

    @Test
    public void shouldReturnZero () {
        Double result = c.exponentiate(null, 2);
        assertEquals(0d, result);
    }

}
