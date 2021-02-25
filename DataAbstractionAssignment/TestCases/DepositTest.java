import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.Date;

public class DepositTest {
    Deposit testSet2;

    @Before
    public void setUp(){
        Date d = new Date();
        testSet2 = new Deposit(100, d, Customer.CHECKING);
    }
    @Test
    public void testing1(){
        assertEquals(testSet2.toString(),"Deposit of " + 100.0 +" "+new java.util.Date()+" into account:  "+Customer.CHECKING);

    }
}