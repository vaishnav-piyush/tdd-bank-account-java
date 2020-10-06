package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class AccountTest {


    @Test
    public void newAccountShouldHave0Balance() {

        Account acc = new Account();
        assertThat(acc.balance()).isEqualTo(0);

    }
}
