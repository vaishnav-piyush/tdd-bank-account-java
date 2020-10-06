package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class AccountTest {

    @Test
    public void newAccountShouldHave0Balance() {

        Account acc = new Account();
        assertThat(acc.balance()).isEqualTo(0);

    }

    @Test
    public void depositingAmountShouldIncreaseBalance() {
        Account acc = new Account();
        acc.deposit(10);
        assertThat(acc.balance()).isEqualTo(10);
    }

    @Test
    public void multipleDepositsShouldAddUpInBalance() {
        Account acc = new Account();
        acc.deposit(10);
        acc.deposit(20);
        assertThat(acc.balance()).isEqualTo(30);
    }

}
