import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.Date;

public class WithdrawTest {
    Withdraw testSet3;

    @Before
    public void setUp(){
        Date Da = new Date();
        testSet3 = new Withdraw(100, Da, Customer.SAVING);
    }
    @Test
    public void test3(){
        assertEquals(testSet3.toString(),"Withdrawal of " + 100.0 +" "+new java.util.Date()+" into account:  "+Customer.SAVING);

    }
}