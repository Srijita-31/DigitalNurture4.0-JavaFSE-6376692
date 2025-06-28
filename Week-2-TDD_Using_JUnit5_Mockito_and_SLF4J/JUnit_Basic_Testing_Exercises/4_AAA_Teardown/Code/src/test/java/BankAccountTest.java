import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount(100.0);
        System.out.println("Setup: Initialized BankAccount with balance: " + account.getBalance());
    }

    @After
    public void tearDown() {
        account = null;
        System.out.println("Teardown: BankAccount instance cleaned up.");
    }

    @Test
    public void testDeposit() {
        double depositAmount = 50.0;
        double expectedBalance = 150.0;
        account.deposit(depositAmount);
        assertEquals(expectedBalance, account.getBalance(), 0.001);
        System.out.println("testDeposit: Deposited " + depositAmount + ", new balance: " + account.getBalance());
    }

    @Test
    public void testWithdraw() {
        double withdrawAmount = 30.0;
        double expectedBalance = 70.0;
        account.withdraw(withdrawAmount);
        assertEquals(expectedBalance, account.getBalance(), 0.001);
        System.out.println("testWithdraw: Withdrew " + withdrawAmount + ", new balance: " + account.getBalance());
    }

    @Test(expected = IllegalArgumentException.class) 
    public void testWithdrawInsufficientFunds() {
        double withdrawAmount = 200.0;
        account.withdraw(withdrawAmount);
        System.out.println("testWithdrawInsufficientFunds: Expected IllegalArgumentException.");
    }

    @Test
    public void testInitialBalance() {
        double currentBalance = account.getBalance();
        assertEquals(100.0, currentBalance, 0.001);
        System.out.println("testInitialBalance: Confirmed initial balance: " + currentBalance);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositNegativeAmount() {
        double negativeAmount = -50.0;
        account.deposit(negativeAmount);
        System.out.println("testDepositNegativeAmount: Expected IllegalArgumentException.");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawNegativeAmount() {
        double negativeAmount = -20.0;
        account.withdraw(negativeAmount);
        System.out.println("testWithdrawNegativeAmount: Expected IllegalArgumentException.");
    }
}

