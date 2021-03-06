package guru.springframework;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class MoneyTest {
	
	
	@Test
	public void testMultiplicationDollar() {
		Money five = Money.dollar(5);		
		assertEquals(Money.dollar(10), five.times(2));		
		assertEquals(Money.dollar(15), five.times(3));
	}
	
	@Test
	public void testEqualityDollar() {
		assertEquals(Money.dollar(5), Money.dollar(5));
		assertNotEquals(Money.dollar(5), Money.dollar(8));
		assertNotEquals(Money.dollar(5), Money.franc(5));
	}
	
	@Test
	public void testMultiplicationFranc() {
		Money five = Money.franc(5);		
		assertEquals(Money.franc(10), five.times(2));		
		assertEquals(Money.franc(15), five.times(3));
	}
	
	@Test
	public void testEqualityFranc() {
		assertEquals(Money.franc(5), Money.franc(5));
		assertNotEquals(Money.franc(5), Money.franc(8));
	}
	
	@Test
	public void testCurrency() {
		assertEquals("USD", Money.dollar(5).currency());
		assertEquals("CHF", Money.franc(8).currency());
	}
}
