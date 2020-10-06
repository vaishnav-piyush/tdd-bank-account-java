package org.xpdojo.bank;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class AccountTest {

    @Test
    public void newAccountShouldHave0Balance() {
        Account acc = Account.emptyAccount();
        assertThat(acc.balance()).isEqualTo(0);
    }

    @Test
    public void depositingAmountShouldIncreaseBalance() {
        Account acc = Account.emptyAccount();
        acc.deposit(10);
        assertThat(acc.balance()).isEqualTo(10);
    }

    @Test
    public void multipleDepositsShouldAddUpInBalance() {
        Account acc = Account.emptyAccount();
        acc.deposit(10);
        acc.deposit(20);
        assertThat(acc.balance()).isEqualTo(30);
    }

    @Test
    public void withdrawFromAccountReflectsInBalance() {
        Account acc = Account.accountWithInitialDeposit(10);
        acc.withdraw(8);
        assertThat(acc.balance()).isEqualTo(2);
    }

    @Test
    public void withdrawInExcessOfBalanceNotAllowed() {
        Account acc = Account.accountWithInitialDeposit(10);
        assertThrows(RuntimeException.class, () -> {
            acc.withdraw(20);
        });
    }

}
