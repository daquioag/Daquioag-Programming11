import org.junit.Test;
import org.junit.Before;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import static org.junit.Assert.*;
public class CustomerTest {
  Customer testSet1;
  @Before
  public void setUp(){ testSet1 = new Customer(); }


  @Test
  public void CustomerDepositTest(){
    testSet1.deposit(3.0, new java.util.Date(),Customer.SAVING);
    testSet1.deposit(3.0, new java.util.Date(),Customer.CHECKING);

  }
  @Test
  public void CustomerWithdrawTest(){
    testSet1.withdraw(3.0, new java.util.Date(),Customer.CHECKING);
    testSet1.withdraw(3.0, new java.util.Date(),Customer.SAVING);
    testSet1.displayWithdraws();


  }


}