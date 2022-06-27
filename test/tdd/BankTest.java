package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    void bankCanBeCreatedTest() {
        Bank bank = new Bank("Semicolon Bank Plc");
        bank.register("John","6754");
        assertEquals(1,bank.getNumberOfCustomer());
    }
}
